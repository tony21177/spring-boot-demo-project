package com.kun.demo.api.service;

import com.kun.demo.api.dto.UserDto;
import com.kun.model.User;

import java.util.List;

/**
 * DemoService接口
 */
public interface UserService {
    List<User> listAllUser();

    int createUser(UserDto userDto);

    int updateUser(Long id, UserDto userDto);

    int deleteUser(Long id);

    User getUser(Long id);
}
