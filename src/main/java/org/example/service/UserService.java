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
}
