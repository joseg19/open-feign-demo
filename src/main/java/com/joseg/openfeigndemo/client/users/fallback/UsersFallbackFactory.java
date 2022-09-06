package com.joseg.openfeigndemo.client.users.fallback;

import com.joseg.openfeigndemo.client.users.UsersFeignClient;
import com.joseg.openfeigndemo.client.users.model.User;
import feign.FeignException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;


@Slf4j
@Component
public class UsersFallbackFactory implements FallbackFactory<UsersFeignClient> {

    @Autowired
    private UsersFallback usersFallback;
    @Autowired
    private UsersFallbackEmptyNull usersFallbackEmptyNull;

    @Override
    public UsersFeignClient create(Throwable cause) {
        log.error("An exception occurred when calling the UsersFeignClient", cause);

        if(cause instanceof FeignException feignException){
            return switch (feignException.status()){
                case 404 -> usersFallback;
                case 500 -> userId -> User.builder().id(10L).name("Betty Rubble").age(32).build();
                default -> usersFallbackEmptyNull;
            };
        }
        return usersFallbackEmptyNull;
    }
}