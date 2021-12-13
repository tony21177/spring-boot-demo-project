package com.kun.demo.api.service.impl;

import com.kun.demo.api.dto.UserDto;
import com.kun.demo.api.service.UserService;
import com.kun.mapper.UserMapper;
import com.kun.model.User;
import com.kun.model.UserExample;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> listAllUser() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public int createUser(UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        return userMapper.insert(user);
    }

    @Override
    public int updateUser(Long id, UserDto userDto) {
        User updateUser = new User();
        BeanUtils.copyProperties(userDto,updateUser);
        updateUser.setId(id);
        return 0;
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public User getUser(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
