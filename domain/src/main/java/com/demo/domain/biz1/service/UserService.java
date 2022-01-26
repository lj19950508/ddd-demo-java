package com.demo.domain.biz1.service;

import com.demo.domain.biz1.entity.User;
import com.demo.domain.biz1.repository.IUserRepository;
import org.springframework.stereotype.Service;

/**
 * @author linjie
 * @date 2022/1/25
 */
@Service
public class UserService {

    final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public void changepwd(User user){

        User queryUser = userRepository.findById(user.getId());

        queryUser.changepwd("123456");

        userRepository.save(queryUser);

    }

}
