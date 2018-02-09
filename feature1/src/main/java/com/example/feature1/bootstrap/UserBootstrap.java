package com.example.feature1.bootstrap;

import com.example.common.entity.User;
import com.example.common.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class UserBootstrap {
    private final UserRepository userRepository;

    @Autowired
    public UserBootstrap(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void onStart() {
        User user = new User();
        user.setId(1L);
        user.setUsername("johndoe");

        userRepository.save(user);
    }
}
