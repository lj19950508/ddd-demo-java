package com.demo.userInterface.facade.rest;

import com.demo.domain.biz1.repository.IUserRepository;
import com.demo.domain.biz1.service.UserService;
import com.demo.userInterface.assembler.UserAssembler;
import com.demo.userInterface.dto.ChangpwdDTO;
import com.demo.userInterface.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */
@RestController
@RequestMapping("/user")
public class UserController {

    final UserService userService;

    final IUserRepository userRepository;

    public UserController(UserService userService, IUserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/")
    public List<UserDTO> list(){
        return new UserAssembler().tran(this.userRepository.findList());
    }

    @PostMapping("/changpwd")
    public String changepwd(ChangpwdDTO dto){
        userService.changepwd(new UserAssembler().tran(dto));
        return "修改成功";
    }
}
