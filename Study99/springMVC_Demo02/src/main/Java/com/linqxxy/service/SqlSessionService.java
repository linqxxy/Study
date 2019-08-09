package com.linqxxy.service;

import lombok.Data;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

@Data
public class SqlSessionService {
    public SqlSessionFactory sqlSessionInit(){
        String file = "sqlMapConfig.xml";
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream(file);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            return sqlSessionFactory;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
