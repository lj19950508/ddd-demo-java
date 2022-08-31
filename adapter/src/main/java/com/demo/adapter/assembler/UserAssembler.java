package com.demo.adapter.assembler;

import com.demo.application.dto.ChangpwdDTO;
import com.demo.domain.biz1.entity.User;
import com.demo.rpcclient.vo.AddressRes;
import com.demo.rpcclient.vo.ChangpwdReq;
import com.demo.rpcclient.vo.UserRes;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */

//do可转dto ， but dto不可转do
public class UserAssembler {


//    public User tran(ChangpwdDTO dto){
//      return new User(dto.getUserId(),null,dto.getPwd(),null);
//    };

    //如何使用映射

    public List<UserRes> tran(List<User> userList){
        List<UserRes> userDTOS = new ArrayList<>();
        userList.forEach(item->{
            UserRes userDTO = new UserRes();
            userDTO.setId(item.getId());
            userDTO.setName(item.getName());
            userDTO.setPwd(item.getPwd());

            AddressRes addressRes = new AddressRes();
            addressRes.setArea(item.getAddress().getArea());
            addressRes.setProvince(item.getAddress().getProvince());
            addressRes.setCity(item.getAddress().getCity());
            addressRes.setDetail(item.getAddress().getDetail());
            userDTO.setAddress(addressRes);
            userDTOS.add(userDTO);
        });
        return userDTOS;

    }

    public ChangpwdDTO tran(ChangpwdReq req){
      ChangpwdDTO changpwdDTO =new ChangpwdDTO();
      changpwdDTO.setUserId(req.getUserId());
      changpwdDTO.setPwd(req.getPwd());
      return changpwdDTO;

    }




}
