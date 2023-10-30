package org.example.service;

import org.example.model.DTO.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 高子航
 */
public interface UserService {
    /**
     * 获取所有用户数据
     * @return 用户列表
     */
    List<UserDTO> getAllUsers();

    /**
     * 添加新用户
     * @param user 用户对象
     * @return 操作结果信息
     */
    String addUser(UserDTO user);


    /**
     * 验证用户身份
     * @param user 用户信息
     * @return 是否确认为该用户
     */
    boolean login(UserDTO user);
}
