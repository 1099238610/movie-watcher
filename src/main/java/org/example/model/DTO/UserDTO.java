package org.example.model.DTO;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author 高子航
 */
@Data
public class UserDTO {
    String username;

    String password;

    String email;

    Timestamp registerTime;
}
