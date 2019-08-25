package com.linqxxy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.linqxxy.po.Classes;
import com.linqxxy.mapper.ClassesMapper;
import com.linqxxy.service.ClassesService;

import java.util.List;


@Service
@Transactional
public class ClassesServiceImpl implements ClassesService {

    //注入Mapper接口对象
    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public List<Classes> selectList(Classes classes) { return classesMapper.selectList(classes); }

    @Override
    public List<Classes> selectAll() {
        return classesMapper.selectAll();
    }

    @Override
    public Classes findByName(String name) {
        return classesMapper.findByName(name);
    }

    @Override
    public int insert(Classes classes) {
        return classesMapper.insert(classes);
    }

    @Override
    public int update(Classes classes) {
        return classesMapper.update(classes);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return classesMapper.deleteById(ids);
    }
}
