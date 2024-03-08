package com.process.shoppingstore.service;

import com.process.shoppingstore.model.User;

import java.util.List;

public interface UserService {

    User createUser(User user);

    User updateUser(User user, Long userId);

    User getUserById(Long userId);

    List<User> getAllUsers();


}
