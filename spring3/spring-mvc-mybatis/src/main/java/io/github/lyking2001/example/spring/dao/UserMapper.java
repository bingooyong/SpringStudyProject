package io.github.lyking2001.example.spring.dao;

import org.apache.ibatis.annotations.Param;

import io.github.lyking2001.example.spring.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
