package com.kerno.sugar.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author sugar
 * 2019/10/30
 * 11:36
 * 基本的数据库访问操作
 */

public interface BaseMapper<T> {

    /**
     * 在对应的表中插入一条记录
     * @param t the object of pojo
     * @return the result of adding {@code pojo} object into database, return 1 if adding successful, otherwise return 0
     */
    int add(T t);

    /**
     * 更新指定记录{@param t}
     * @param t the object of pojo which is {@link T} instance object
     * @return the result of updating {@code pojo} object, return 1 if updating successful, otherwise return 0
     */
    int update(T t);

    /**
     * 通过表主键查找响应记录
     * @param id the value of primary key
     * @return {@link T} object
     */
    T find(int id);

    /**
     * 查询表中所有的记录
     * @return  the {@link List <T>}
     */
    List<T> findAll();


    /**
     * 通过表主键删除记录
     * @param id the value of primary key
     * @return the result of deleting {@code pojo} object from database, return {@code true} if deleting successful, otherwise return {@code false}
     */
    boolean delete(int id);
}
