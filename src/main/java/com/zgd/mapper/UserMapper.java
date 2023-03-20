package com.zgd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zgd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from user where id = #{id}")
    User getUserById(Integer id);
}
