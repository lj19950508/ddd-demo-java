package com.demo.userInterface.assembler;

import com.demo.domain.biz1.entity.User;
import com.demo.userInterface.dto.ChangpwdDTO;
import com.demo.userInterface.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */
public class UserAssembler {


    public User tran(ChangpwdDTO dto){
      return new User(dto.getUserId(),null,dto.getPwd(),null);
    };

    public List<UserDTO> tran(List<User> userList){
        List<UserDTO> userDTOS = new ArrayList<>();
        userList.forEach(item->{
            UserDTO userDTO = new UserDTO();
            userDTO.setId(item.getId());
            userDTO.setName(item.getName());
            userDTO.setPwd(item.getPwd());
            userDTO.setAddress(item.getAddress());
            userDTOS.add(userDTO);
        });
        return userDTOS;

    }



}
