package org.example.service.Impl;

import jakarta.annotation.Resource;
import org.example.mapper.UserMapper;
import org.example.model.DTO.UserDTO;
import org.example.model.entity.User;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
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
        
        // 设置用户注册的时间戳
        userDTO.setRegisterTime(new Timestamp(System.currentTimeMillis()));
        
        User user = modelMapper.map(userDTO, User.class);
        userMapper.insertUser(user);
        
        return null;
    }

    @Override
    public boolean login(UserDTO user) {
        // 获取数据库密码
        String encodePassword = userMapper.selectPassword(user.getEmail());
        
        // 匹配密文是否正确
        if (! passwordEncoder.matches(user.getPassword(), encodePassword)){
            return false;
        }

        // 账号密码正确了才将认证信息放到上下文中
        Authentication authentication = new UsernamePasswordAuthenticationToken(user.getEmail(), user.getPassword(), null);
        SecurityContextHolder.getContext().setAuthentication(authentication);
        
        return true;
    }


}
