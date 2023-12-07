package org.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.example.model.entity.MovieReview;

import java.util.List;

/**
 * @author 高子航
 */
@Mapper
public interface MovieReviewMapper {

    /**
     * 添加一条新的影评
     * @param review 影评数据对象
     */
    void addReview(MovieReview review);

    /**
     * 基于 Id 删除一条影评
     * @param id 影评 Id
     */
    void removeReview(int id);

    /**
     * 更新一条影评
     * @param review 影评数据对象
     */
    void updateReview(MovieReview review);

    /**
     * 获取当前用户的所有影评
     * @param userId 用户 Id
     * @return 影评列表
     */
    List<MovieReview> getReviewByUser(int userId);
}
