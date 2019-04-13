package com.xianglei.mapper;

import org.apache.ibatis.annotations.Select;
import com.xianglei.pojo.User;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
   public List<User> findAll();
}
