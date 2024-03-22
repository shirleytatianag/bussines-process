package com.process.shoppingstore.service;

import com.process.shoppingstore.model.User;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User updateUser(User user, Long userId) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return User.builder().userFullName("Shirley")
                .userIdentification("233").build();
    }



    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
