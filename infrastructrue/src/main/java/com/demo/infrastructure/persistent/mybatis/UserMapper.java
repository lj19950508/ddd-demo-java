package com.demo.infrastructure.persistent.mybatis;

import com.demo.domain.biz1.entity.User;
import com.demo.infrastructure.persistent.po.UserPo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author linjie
 * @date 2022/1/25
 */
@Mapper
public interface UserMapper {

    UserPo findById(Long id);

    List<UserPo> findList();

    void insert(UserPo user);

    void update(UserPo user);

}
