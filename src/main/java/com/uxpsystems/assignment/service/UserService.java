package com.uxpsystems.assignment.service;
import com.uxpsystems.assignment.dao.UserRepository;
import com.uxpsystems.assignment.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{
    @Autowired
    UserRepository userRepository;

    public List<User> getAllUsers(){
        return (List<User>)userRepository.findAll();
    }

    public Long deleteUser(Long id){
        try {
            userRepository.deleteById(id);
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Long updateUser(User user){
        try {
            userRepository.save(user);
            return user.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Long addUser(User user){
        try {
            userRepository.save(user);
            return user.getId();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
