package com.pramodvaddiraju.user_service.service;

import com.pramodvaddiraju.user_service.entity.User;
import com.pramodvaddiraju.user_service.exceptions.ResourceNotFoundException;
import com.pramodvaddiraju.user_service.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Page<User> getAllUsers(Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElseThrow(
                ()-> new ResourceNotFoundException("User Not found with id: " + id)
        );
    }

    @Override
    public void deleteUserById(int id) {
        userRepository.deleteById(id);

    }
}
