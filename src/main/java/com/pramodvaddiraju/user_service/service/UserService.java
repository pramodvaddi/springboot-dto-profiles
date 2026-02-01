package com.pramodvaddiraju.user_service.service;

import com.pramodvaddiraju.user_service.entity.User;
import com.pramodvaddiraju.user_service.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User saveUser(User user);
    Page<User> getAllUsers(Pageable pageable);
    User getUserById(int id);
    void deleteUserById(int id);


}
