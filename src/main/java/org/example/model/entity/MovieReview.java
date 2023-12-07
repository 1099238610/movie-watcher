package org.example.model.entity;

import java.sql.Timestamp;

/**
 * @author Gzh
 */
public class MovieReview {
    int userId;
    
    int movieId;
    
    String review;
    
    Timestamp createTime;
    
    int rating;
}
