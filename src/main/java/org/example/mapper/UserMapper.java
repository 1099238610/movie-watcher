package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.entity.User;

import java.util.List;

/**
 * @author 高子航
 */
@Mapper
public interface UserMapper {
    /**
     * 查询所有用户 
     * @return 用户列表
     */
    List<User> selectAll();
}
