package org.example.service.Impl;

import jakarta.annotation.Resource;
import org.example.mapper.UserMapper;
import org.example.model.DTO.UserDTO;
import org.example.model.entity.User;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
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

    @Resource
    private ModelMapper modelMapper;
    
    @Resource
    private PasswordEncoder passwordEncoder;
    
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

        return userDTOList;
    }

    @Override
    public String addUser(UserDTO userDTO) {
        // 加密用户密码
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user = modelMapper.map(userDTO, User.class);
        userMapper.insertUser(user);
        return null;
    }
}
