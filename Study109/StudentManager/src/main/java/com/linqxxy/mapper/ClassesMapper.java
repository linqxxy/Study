package com.linqxxy.mapper;

import com.linqxxy.po.Classes;

import java.util.List;

/**
 * @project: sms
 * @description: 数据访问层-操控班级信息
 * @author: 黄宇辉
 * @date: 6/14/2019-5:07 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */
public interface ClassesMapper {

    // TODO: 6/14/2019 根据班级名称获取指定/全部班级信息列表
    List<Classes> selectList(Classes clazz);

    // TODO: 6/16/2019 查询所有班级列表信息(用于在学生管理页面中获取班级信息)
    List<Classes> selectAll();

    // TODO: 6/15/2019 获取指定名称的班级信息
    Classes findByName(String name);

    // TODO: 6/15/2019 添加班级信息
    int insert(Classes clazz);

    // TODO: 6/15/2019 根据id删除指定班级信息
    int deleteById(Integer[] ids);

    // TODO: 6/15/2019 根据id修改指定班级信息
    int update(Classes clazz);

}
