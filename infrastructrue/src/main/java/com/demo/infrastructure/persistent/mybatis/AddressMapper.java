package com.demo.infrastructure.persistent.mybatis;

import com.demo.infrastructure.persistent.pojo.AddressPo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author linjie
 * @date 2022/1/25
 */
@Mapper
public interface AddressMapper {

    AddressPo findByUserId(Long userId);

    void save(AddressPo address);

}
