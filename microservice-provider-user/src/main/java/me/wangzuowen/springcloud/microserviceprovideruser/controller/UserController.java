package me.wangzuowen.springcloud.microserviceprovideruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import me.wangzuowen.springcloud.microserviceprovideruser.entity.User;
import me.wangzuowen.springcloud.microserviceprovideruser.repository.UserRepository;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findOne(id);
        return user;
    }
}
