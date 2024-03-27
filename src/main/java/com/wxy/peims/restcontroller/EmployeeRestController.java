package com.wxy.peims.restcontroller;

import com.wxy.peims.model.ResultModel;
import com.wxy.peims.model.UserQuery;
import com.wxy.peims.pojo.User;
import com.wxy.peims.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/v1/")
public class EmployeeRestController {
    @Autowired
    private UserService service;

    @RequestMapping("employees")
    public ResultModel<List<User>> getAllUsers(){
        List<User> users = service.getAllUsers();

        ResultModel<List<User>> resultModel = new ResultModel<>();
        resultModel.setCode(0);
        resultModel.setMsg("查询成功！");
        resultModel.setCount(users.size());
        resultModel.setData(users);

        return resultModel;
    }

    @RequestMapping("employees/query")
    public ResultModel<List<User>> queryUsersByUsername(UserQuery userQuery) {
        System.out.println(userQuery);
        ResultModel<List<User>> resultModel = new ResultModel<>(1, "", 0, null);

        PageInfo<User> pageInfo = service.queryUsersByUsername(userQuery);
        resultModel.setCode(0);
        resultModel.setCount((int) pageInfo.getTotal());
        resultModel.setData(pageInfo.getList());
        System.out.println(pageInfo.getList().size());
        return resultModel;
    }
}
