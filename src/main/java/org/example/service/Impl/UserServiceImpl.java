package org.example.service.Impl;

import jakarta.annotation.Resource;
import org.example.mapper.UserMapper;
import org.example.model.DTO.UserDTO;
import org.example.model.entity.User;
import org.example.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 高子航
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Resource
    private UserMapper userMapper;
    
    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userMapper.selectAll();
        List<UserDTO> userDTOList = new ArrayList<>();
        
        
        // 将 user 转化为 DTO 对象
        for(User user: users){
            UserDTO userDTO = new UserDTO();
            userDTO.setUsername(user.getUsername());
            userDTOList.add(userDTO);
        }
        System.out.printf(userDTOList.toString());
        return userDTOList;
    }
}
