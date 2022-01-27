package com.demo.infrastructure.persistent.impl;

import com.demo.domain.biz1.entity.User;
import com.demo.domain.biz1.repository.IUserRepository;
import com.demo.domain.biz1.valueobject.Address;
import com.demo.infrastructure.persistent.mybatis.AddressMapper;
import com.demo.infrastructure.persistent.mybatis.UserMapper;
import com.demo.infrastructure.persistent.pojo.AddressPo;
import com.demo.infrastructure.persistent.pojo.UserPo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */
@Repository
public class UserRepository implements IUserRepository {

    final UserMapper userMapper;
    final AddressMapper addressMapper;

    public UserRepository(UserMapper userMapper, AddressMapper addressMapper) {
        this.userMapper = userMapper;
        this.addressMapper = addressMapper;
    }

    @Override
    public User findById(Long id) {
        UserPo userPo = this.userMapper.findById(id);
        AddressPo addressPo = this.addressMapper.findByUserId(id);
        User user =new User(id,userPo.getName(),userPo.getPwd(),new Address(addressPo.getProvince(),addressPo.getCity(),addressPo.getArea(),addressPo.getDetail()));
        return user;
    }

    @Override
    public List<User> findList() {
        List<User> users = new ArrayList<>();
        List<UserPo> userPo = this.userMapper.findList();



        userPo.forEach(item->{
            AddressPo addressPo = this.addressMapper.findByUserId(item.getId());
            User user =new User(item.getId(),item.getName(),item.getPwd(),new Address(addressPo.getProvince(),addressPo.getCity(),addressPo.getArea(),addressPo.getDetail()));
            users.add(user);
        });
        return users;

    }

    @Override
    public void save(User user) {
        //需要有一层适配器把user->userPo
        //todo 这一边放不知道如何去掉do的 getter
        UserPo userPo = new UserPo();
        userPo.setId(user.getId());
        userPo.setPwd(user.getPwd());
        userPo.setName(user.getName());
        userMapper.save(userPo);
        AddressPo addressPo = new AddressPo();
        addressPo.setUserId(user.getId());
        addressPo.setCity(user.getAddress().getCity());
        addressPo.setProvince(user.getAddress().getProvince());
        addressPo.setArea(user.getAddress().getArea());
        addressPo.setDetail(user.getAddress().getDetail());
        addressMapper.save(addressPo);

    }
}
