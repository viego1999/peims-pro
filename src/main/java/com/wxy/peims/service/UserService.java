package com.wxy.peims.service;

import com.wxy.peims.model.ResultModel;
import com.wxy.peims.model.UserQuery;
import com.wxy.peims.pojo.User;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {

    public List<User> getAllUsers();

    public PageInfo<User> queryUsersByUsername(UserQuery userQuery);

    public User queryUserById(Integer userId);

    public User updateUser(User newUser);

    public User insertUser(User user);

    public ResultModel deleteUser(Integer userId);
}
