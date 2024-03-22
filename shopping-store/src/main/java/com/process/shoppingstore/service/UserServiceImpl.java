package com.process.shoppingstore.service;

import com.process.shoppingstore.model.User;
import com.process.shoppingstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long userId) {
        Optional<User> user1 = userRepository.findById(userId);

        if (user1.isEmpty()) {
            return null;
        }

        user1.get().setUserIdentification(user.getUserFullName());
        user1.get().setUserPhoneNumber(user.getUserPhoneNumber());

        return userRepository.save(user1.get());
    }

    @Override
    public User getUserById(Long userId) {
       Optional<User> user = userRepository.findById(userId);

       if (user.isEmpty()){
           return null;
       }

       return user.get();

    }


    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
