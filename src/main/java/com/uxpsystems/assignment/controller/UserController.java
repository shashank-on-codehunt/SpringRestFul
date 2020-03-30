package com.uxpsystems.assignment.controller;

import com.uxpsystems.assignment.dao.entity.User;
import com.uxpsystems.assignment.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        ResponseEntity<List<User>> result;
        List<User> userList = userService.getAllUsers();
        if (userList.size() == 0) {
            System.out.println("No records Found..");
            result = new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            result = new ResponseEntity<>(userList, HttpStatus.OK);
        }
        return result;
    }

    @RequestMapping(value="/user", method=RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<Long> addUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.addUser(user),HttpStatus.OK);
    }

    @RequestMapping(value="/user", method=RequestMethod.PUT, consumes = "application/json")
    public ResponseEntity<Long> updateUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(user),HttpStatus.OK);
    }

    @RequestMapping(value="/user", method=RequestMethod.DELETE, consumes = "application/json")
    public ResponseEntity<Long> deleteUser(@RequestBody Long id) {
        return new ResponseEntity<>(userService.deleteUser(id),HttpStatus.OK);
    }
}
