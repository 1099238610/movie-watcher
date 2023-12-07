package org.example.model.DTO;

import lombok.Data;

import java.sql.Timestamp;

/**
 * @author Gzh
 */
@Data
public class MovieReviewDTO {
    int userId;

    int movieId;
    
    String review;
    
    Timestamp createTime;
    
    int rating;
}
