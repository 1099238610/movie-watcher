package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.DTO.MovieDTO;

import java.util.List;
import java.util.Map;

/**
 * @author Gzh
 */
@Mapper
public interface MovieMapper {

    /**
     * 查询指定页面的电影信息
     * @param params 页数 和 页面大小
     * @return 包含该页所有信息的列表
     */
    List<MovieDTO> getMovieListByPageNum(Map params);
}
