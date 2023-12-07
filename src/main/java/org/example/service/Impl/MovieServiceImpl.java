package org.example.service.Impl;

import jakarta.annotation.Resource;
import org.example.mapper.MovieMapper;
import org.example.model.DTO.MovieDTO;
import org.example.service.MovieService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 高子航
 */
@Service
public class MovieServiceImpl implements MovieService {
    
    @Resource
    MovieMapper movieMapper;
    
    @Override
    public List<MovieDTO> getMoviePage(int pageNum, int pageSize) {
        // 计算实际分页偏移量, 等于 (页码 - 1) * size
        int offset = (pageNum - 1) * pageSize;
        // 使用 of 函数直接创建 map
        Map<String, Object> params = Map.of("offset", offset, "size", pageSize);

        System.out.printf(movieMapper.getMovieListByPageNum(params).toString());
        return movieMapper.getMovieListByPageNum(params);
    }
}
