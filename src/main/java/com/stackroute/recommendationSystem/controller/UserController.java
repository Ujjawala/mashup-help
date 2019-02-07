package com.stackroute.recommendationSystem.controller;

import com.stackroute.recommendationSystem.Exceptions.UserDuplicationException;
import com.stackroute.recommendationSystem.Exceptions.UserNullFieldException;
import com.stackroute.recommendationSystem.domain.User;
import com.stackroute.recommendationSystem.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping(path="api/v1")
public class UserController {
    UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "addUser", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        User user1;
        user1 = userService.createUserNode(user);
        return new ResponseEntity<User>(user1, HttpStatus.OK);
    }


    @RequestMapping(value = "users", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listOfUsers() {
        System.out.println("incoming request ");
        List<User> allUsers = userService.getAllUsers();
        System.out.println("all data is "+allUsers.toString());
        return new ResponseEntity<List<User>>(allUsers, HttpStatus.OK);
    }

}
