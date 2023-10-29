package org.example.controller;

import jakarta.annotation.Resource;
import lombok.Getter;
import org.example.model.DTO.UserDTO;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        System.out.printf("Control" + userService.getAllUsers().toString());
        return userService.getAllUsers();
    }
    
}
