package com.wxy.peims.service;

import com.wxy.peims.model.CheckQuery;
import com.wxy.peims.model.UserQuery;
import com.wxy.peims.pojo.Check;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface CheckService {

    public List<Check> getAllChecks();

    public Check queryCheckByCid(Long cid);

    public PageInfo<Check> queryCheckByUsername(UserQuery userQuery);

    public PageInfo<Check> queryCheckByParams(CheckQuery checkQuery);

    public int insertCheck(Check check);

    public Check updateCheck(Check check);

    public int deleteCheck(Long cid);
}
