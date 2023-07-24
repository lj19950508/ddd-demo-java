package com.demo.adapter.out.persistent.pojo;

import com.demo.domain.biz1.entity.User;
import com.demo.domain.biz1.repository.IUserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author linjie
 * @date 2022/9/20
 */

@Repository
public class UserRepositoryImpl implements IUserRepository {
    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findList() {
        return null;
    }

    @Override
    public void save(User user) {

    }
}
