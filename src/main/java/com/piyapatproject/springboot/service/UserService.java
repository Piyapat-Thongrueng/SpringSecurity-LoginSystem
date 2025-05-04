package com.piyapatproject.springboot.service;

import com.piyapatproject.springboot.dto.UserDto;
import com.piyapatproject.springboot.entity.User;

public interface UserService {

    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
