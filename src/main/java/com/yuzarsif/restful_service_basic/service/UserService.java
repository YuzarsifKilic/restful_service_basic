package com.yuzarsif.restful_service_basic.service;

import com.yuzarsif.restful_service_basic.dto.UserDto;
import com.yuzarsif.restful_service_basic.entity.User;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
