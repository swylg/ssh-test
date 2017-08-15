package com.swylg.java.service;

import com.swylg.java.entity.User;

import java.util.List;

/**
 * Created by shuchen on 2017/8/15.
 */
public interface UserService {
    public void saveUsers(List<User> us);

    public List<User> getAllUsernames();
}



