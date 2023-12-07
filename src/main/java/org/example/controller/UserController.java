package org.example.controller;

import jakarta.annotation.Resource;
import org.example.model.DTO.UserDTO;
import org.example.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author 高子航
 */
@RestController
@RequestMapping("/user")
public class UserController {
    
    @Resource
    private UserService userService;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
        return "success";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Boolean login(@RequestBody UserDTO userDTO) {
        return userService.login(userDTO);
    }
    
}
