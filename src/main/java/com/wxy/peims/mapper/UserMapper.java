package com.wxy.peims.mapper;

import com.wxy.peims.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * User Mapper Interface, implemented the tb_user CRUD operations.
 *
 * @author Wuxy
 * @version 1.0
 * @see UserMapper
 * @since 1.8
 */
public interface UserMapper {

    /**
     * get all users
     *
     * @return {@link List}<{@link com.wxy.peims.pojo.User}>
     */
    public List<User> getAllUsers();

    /**
     * Query the employees by username
     *
     * @param username username
     * @return {@link List}<{@link com.wxy.peims.pojo.User}>
     */
    public List<User> queryUsersByUsername(@Param("username") String username);

    /**
     * query user by id
     *
     * @param id the queried id
     * @return {@link com.wxy.peims.pojo.User}
     */
    public User queryUserById(@Param("id") Integer id);

    /**
     * get Users by username
     *
     * @param username the name of the user
     * @return {@link List}<{@link com.wxy.peims.pojo.User}>
     */
    public List<User> queryUsersByName(@Param("username") String username);

    /**
     * update a user
     *
     * @param newUser new user object
     * @return Number of rows affected.
     */
    public int updateUser(@Param("newUser") User newUser);

    /**
     * Delete a user by user id.
     *
     * @param userId user id
     * @return Number of rows affected.
     */
    public int deleteUser(@Param("userId") Integer userId);

    /**
     * Insert a user
     *
     * @param user user object
     * @return Number of rows affected.
     */
    public int insertUser(@Param("user") User user);
}
