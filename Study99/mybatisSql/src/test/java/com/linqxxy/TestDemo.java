package com.linqxxy;

import com.linqxxy.bz.UserBz;
import com.linqxxy.mapper.OrderMapper;
import com.linqxxy.mapper.UserMapper;
import com.linqxxy.po.Orderdetail;
import com.linqxxy.po.Orders;
import com.linqxxy.po.User;
import com.linqxxy.po.UserEx;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestDemo {
    SqlSessionFactory sqlSessionFactory;

    @Before
    public void initTest(){
        String file ="sqlMapConfig.xml";
        InputStream is= null;
        try {
            is=Resources.getResourceAsStream(file);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(is);

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public  void queryUserZH(){
        SqlSession sqlSession=sqlSessionFactory.openSession();
        try {
            UserEx userEx=new UserEx();
            userEx.setSex("2");
            userEx.setUsername("vin");
            UserBz userBz=new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExes=userMapper.queryUserZH(null);
            System.out.println(userExes);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void testQueryUserCount(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserEx userEx = new UserEx();
            userEx.setSex("2");
            userEx.setUsername("vin");
            UserBz userBz = new UserBz();
            userBz.setUserEx(userEx);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int flag = userMapper.queryUserCount(null);
            System.out.println(flag);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void testqueryUserByMoreIds(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<Integer> list=new ArrayList<>();
            UserBz userBz = new UserBz();
            list.add(24);
            list.add(26);
            userBz.setMoreIds(list);
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserEx> userExes = userMapper.queryUserByMoreIds(userBz);
            System.out.println(userExes);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void queryUserToOrders(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Orders> ordersList= userMapper.queryUserToOrders();
            System.out.println(ordersList.size()+"  "+ordersList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void queryUserToOrderdetail(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Orderdetail> orderdetails= userMapper.queryUserToOrderdetail();
            System.out.println(orderdetails.size()+"  "+orderdetails);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    @Test
    public void queryUserToItems(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList= userMapper.queryUserToItems();
            System.out.println(userList.size()+"  "+userList);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
