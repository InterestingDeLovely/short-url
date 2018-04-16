package com.url.dao;

import com.url.modle.NewsList;
import com.url.modle.System;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 短链接数据库表操作
 * @author YI
 * @date 2018-4-16 14:26:05
 */
public interface NewsListDao {
    @Select("SELECT * FROM newslist")
    List<System> getAll();

    @Select("SELECT * FROM newslist WHERE id = #{id}")
    System getOne(Long id);

    @Insert("INSERT INTO newslist(shortName, longName, description, shortAuthor, shortStatus, shortLook, isShow, newsTime) " +
            "VALUES(#{shortName}, #{longName}, #{description}, #{shortAuthor}, #{shortStatus}, #{shortLook}, #{isShow}, #{newsTime})")
    void insert(NewsList newsList);

    @Update("UPDATE newslist SET " +
            "shortName = #{shortName}, longName = #{longName}, description = #{description}, shortAuthor = #{shortAuthor}, shortStatus = #{shortStatus}, " +
            "shortLook = #{shortLook}, isShow = #{isShow}, newsTime = #{newsTime} WHERE id =#{id}")
    Integer update(NewsList newsList);

    @Delete("DELETE FROM newslist WHERE id =#{id}")
    void delete(Long id);
}
