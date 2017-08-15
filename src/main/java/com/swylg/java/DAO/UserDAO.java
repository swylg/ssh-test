package com.swylg.java.DAO;

import com.swylg.java.entity.User;

import java.util.List;

/**
 * Created by shuchen on 2017/8/15.
 */
public interface UserDAO {
    public int save(User u);

    public List<User> findAll();
}
