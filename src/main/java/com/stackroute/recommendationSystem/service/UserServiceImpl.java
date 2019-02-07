package com.stackroute.recommendationSystem.service;

import com.stackroute.recommendationSystem.domain.Question;
import com.stackroute.recommendationSystem.domain.User;
import com.stackroute.recommendationSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements  UserService{
    @Autowired
    UserRepository userRepository;
    public User createUserNode(User user){
        return userRepository.saveUser(user.getId(),user.getEmailid(),user.getInterests());
    }

    public User deleteUserNode(User user){
        userRepository.delete(user);
        return null;
    }
    public User updateUserNode(User user){
        userRepository.updateUserNode(user.getEmailid());
        return user;
    }
    public List<User> getAllUsers(){

        return userRepository.getAllUsers();
}

}
