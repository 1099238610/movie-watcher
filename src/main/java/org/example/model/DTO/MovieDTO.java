package org.example.model.DTO;

import lombok.Data;

import java.sql.Date;

@Data
public class MovieDTO {
    /**
     * 主键 ID
     */
    int id;

    /**
     *  电影豆瓣 ID
     */
    int movieId;

    /**
     *  电影名称
     */
    String movieName;

    /**
     *  别名
     */
    String alias;

    /**
     *  主演
     */
    String actors;

    /**
     *  封面图片链接
     */
    String cover;

    /**
     *  电影名称
     */
    String directors;

    /**
     *  类型
     */
    String genres;

    /**
     *  官方网址
     */
    String officialSite;

    /**
     *  地区
     */
    String regions;

    /**
     *  语言
     */
    String languages;

    /**
     *  上映日期
     */
    Date releaseDate;

    /**
     *  电影分钟数
     */
    int mins;

    /**
     *  IMDB 电影 ID
     */
    String imdbId;

    /**
     *  豆瓣评分
     */
    double doubanScore;

    /**
     *  豆瓣投票数
     */
    int doubanVote;

    /**
     *  标签
     */
    String tags;

    /**
     *  电影描述
     */
    String storyLine;

    /**
     *  加密的 URL
     */
    String slug;

    /**
     *  年份
     */
    int year;

    /**
     *  演员与PERSON_ID的对应关系，多个演员采用“|”符号分割，格式“演员A:ID|演员B:ID”
     */
    String  actorIds;

    /**
     *  导演与PERSON_ID的对应关系，多个导演采用“|”符号分割，格式“导演A:ID|导演B:ID”
     */
    String directorIds;
}
