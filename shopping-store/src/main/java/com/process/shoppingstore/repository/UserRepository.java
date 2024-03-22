package com.process.shoppingstore.repository;

import com.process.shoppingstore.model.User;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUserEmail(String userEmail);
    List<User> findByUserBirthDate(LocalDate userBirthDate);

}
