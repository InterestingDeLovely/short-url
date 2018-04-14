package com.url.dao;

import com.url.modle.System;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * 通过映射操作数据库
 * @author YI
 * @data 2018-4-14 12:37:14
 */
public interface SystemDao {
    @Select("SELECT * FROM system")
    List<System> getAll();

    @Select("SELECT * FROM system WHERE id = #{id}")
    System getOne(Long id);

    @Insert("INSERT INTO system(server,dataBaseVersion,userRights,keywords,cmsName,author,record,powerby,version,homePage,maxUpload,description,crtTime) " +
            "VALUES(#{server}, #{dataBaseVersion},#{userRights},#{keywords},#{cmsName},#{author},#{record},#{powerby},#{version},#{homePage},#{maxUpload}, #{description}, #{crtTime})")
    void insert(System system);

    @Update("UPDATE system SET " +
            "server = #{server},dataBaseVersion = #{dataBaseVersion},userRights = #{userRights},keywords = #{keywords},cmsName = #{cmsName}," +
            "author = #{author},record = #{record},powerby = #{powerby},version = #{version},homePage = #{homePage},maxUpload = #{maxUpload}," +
            "description = #{description},crtTime = #{crtTime} WHERE id =#{id}")
    Integer update(System system);

    @Delete("DELETE FROM system WHERE id =#{id}")
    void delete(Long id);
}
