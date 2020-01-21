package com.linqxxy.mapper;

import com.linqxxy.po.Grade;

import java.util.List;


public interface GradeMapper {

    // TODO: 6/14/2019 根据年级名称查询指定/全部年级信息列表
    List<Grade> selectList(Grade gradename);

    // TODO: 6/15/2019 查询所有年级信息列表(用于在班级管理页面中获取年级信息)
    List<Grade> selectAll();

    // TODO: 6/14/2019 根据年级名称查询指定的年级信息
    Grade findByName(String gradename);

    // TODO: 6/14/2019 添加年级信息 
    int insert(Grade grade);

    // TODO: 6/14/2019 根据id修改指定年级信息
    int update(Grade grade);

    // TODO: 6/14/2019 根据id删除指定年级信息
    int deleteById(Integer[] ids);
}