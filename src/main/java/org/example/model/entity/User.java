package org.example.model.entity;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 高子航
 */
@Data
public class User {
    Integer id;
    
    String username;
    
    String password;
    
    String email;

    Timestamp registerTime;
}
