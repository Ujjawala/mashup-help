package com.stackroute.recommendationSystem.service;

import com.stackroute.recommendationSystem.domain.Question;
import com.stackroute.recommendationSystem.domain.User;

import java.util.Collection;
import java.util.List;

public interface UserService {
    public List<User> getAllUsers();
    public User updateUserNode(User user);
    public User deleteUserNode(User user);
    public User createUserNode(User user);
}
