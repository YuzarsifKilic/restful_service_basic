package com.yuzarsif.restful_service_basic.repository;

import com.yuzarsif.restful_service_basic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
