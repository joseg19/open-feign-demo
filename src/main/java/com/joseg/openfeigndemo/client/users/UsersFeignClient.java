package com.joseg.openfeigndemo.client.users;

import com.joseg.openfeigndemo.client.users.fallback.UsersFallbackFactory;
import com.joseg.openfeigndemo.client.users.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(value = "users", url = "http://localhost:8084", fallbackFactory = UsersFallbackFactory.class)
public interface UsersFeignClient {

    @GetMapping("/users/{userId}")
    User getUserById(@PathVariable long userId);

}
