package com.demo.domain.biz1.repository;

import com.demo.domain.biz1.entity.User;

import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */
public interface IUserRepository {


//    Load

//    Add
//    Update
//    Save
//    Remove
    User findById(Long id);

    List<User> findList();

    void save(User user);

}
