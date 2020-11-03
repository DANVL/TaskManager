package com.tasker.demo.service;

import com.tasker.demo.data.entity.User;

public interface UserService {
    void createUser(User user);
    User getUser(User user);
}
