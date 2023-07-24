package com.demo.adapter.in.http.rest.api;

import com.demo.domain.biz1.entity.User;
import com.demo.domain.biz1.repository.IUserRepository;
import com.demo.application.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author linjie
 * @date 2022/1/25
 */
@RestController
@RequestMapping("user")
public class UserController {

    final UserService userService;

    final IUserRepository userRepository;

    public UserController(UserService userService, IUserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public String list() {
        return "hello wrold";
    }
}
