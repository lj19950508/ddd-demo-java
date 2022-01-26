package com.demo.infrastructure.persistent.mybatis;

import com.demo.infrastructure.persistent.pojo.UserPo;
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

    void save(UserPo user);

}
