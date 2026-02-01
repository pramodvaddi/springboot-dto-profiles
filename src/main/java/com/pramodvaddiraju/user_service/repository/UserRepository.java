package com.pramodvaddiraju.user_service.repository;

import com.pramodvaddiraju.user_service.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserId(String userName);
}
