package com.demo.application.service;

import com.demo.application.dto.ChangpwdDTO;
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

    public void changepwd(ChangpwdDTO dto){

        User queryUser = userRepository.findById(dto.getUserId());
        queryUser.changepwd(dto.getPwd());
        userRepository.save(queryUser);

    }

}
