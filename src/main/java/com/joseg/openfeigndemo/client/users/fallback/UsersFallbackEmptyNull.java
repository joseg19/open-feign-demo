package com.joseg.openfeigndemo.client.users.fallback;

import com.joseg.openfeigndemo.client.users.UsersFeignClient;
import com.joseg.openfeigndemo.client.users.model.User;
import org.springframework.stereotype.Component;

@Component
public class UsersFallbackEmptyNull implements UsersFeignClient {

    @Override
    public User getUserById(long userId) {
        return null;
    }
}
