package org.example.service;

import org.example.model.DTO.MovieDTO;

import java.util.List;

public interface MovieService {
    
    /**
     * 查询指定页面的电影信息
     *
     * @param pageNum  页数
     * @param pageSize 页面大小
     * @return 包含该页所有信息的列表
     */
    List<MovieDTO> getMoviePage(int pageNum, int pageSize);
}
