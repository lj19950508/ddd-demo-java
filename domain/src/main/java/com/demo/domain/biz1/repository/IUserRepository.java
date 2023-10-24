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

//    这个由于cqrs 将会挪到queryiml
    List<User> findList();

//    全量更新或者 添加 ，  更新时候需要先findById
    void save(User user);

//  需要一个update 按需更新  update

//    remove（LongId）
}
