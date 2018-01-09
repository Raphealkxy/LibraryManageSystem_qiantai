package com.timmy.service.impl;

import com.timmy.mapper.ItemsUserMapper;
import com.timmy.mapper.UserMapper;
import com.timmy.po.ItemsUser;
import com.timmy.po.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RegisterServiceImp implements RegisterService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ItemsUserMapper itemsUserMapper;
    public List<ItemsUser> checkUsername(String username) throws Exception {
              return itemsUserMapper.checkUsername(username);
    }

    public int registerUser(User user) throws Exception {

           return userMapper.insert(user);
    }

    public List<ItemsUser> checkEmail(String email) throws Exception {
        return itemsUserMapper.checkEmail(email);
    }

    public List<ItemsUser> checkPhone(String phone) throws Exception {
        return itemsUserMapper.checkPhone(phone);
    }

    public List<ItemsUser> userActive(String code) throws Exception {
        return itemsUserMapper.userActive(code);
    }

    public int updateUser(User user) throws Exception {
        return userMapper.updateByPrimaryKey(user);
    }
}
