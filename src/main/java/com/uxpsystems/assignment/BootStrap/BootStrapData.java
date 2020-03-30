package com.uxpsystems.assignment.BootStrap;

import com.uxpsystems.assignment.dao.UserRepository;
import com.uxpsystems.assignment.dao.entity.Status;
import com.uxpsystems.assignment.dao.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * BootStrapData Class will update the
 */
@Component
public class BootStrapData implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Started in Bootstrap");
        User user = new User();
        user.setUsername("User1");
        user.setPassword("password1");
        user.setStatus(Status.Deactivated);
        userRepository.save(user);
        System.out.println("User Count: " + userRepository.count());
    }
}
