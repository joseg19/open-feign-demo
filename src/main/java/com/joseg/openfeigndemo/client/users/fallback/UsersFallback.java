package com.joseg.openfeigndemo.client.users.fallback;

import com.joseg.openfeigndemo.client.users.UsersFeignClient;
import com.joseg.openfeigndemo.client.users.model.User;
import org.springframework.stereotype.Component;


@Component
public class UsersFallback implements UsersFeignClient {

    @Override
    public User getUserById(long userId) {
        return User.builder().id(5L).name("Dino").age(7).build();
    }
}
