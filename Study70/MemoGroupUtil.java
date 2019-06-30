package com.linqxxy.git;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemoGroupUtil {
    public static Boolean createMemoGroup(MemoGroup memoGroup){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try(
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/memo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8");
                    PreparedStatement statement=connection.prepareStatement("insert into memo_group " + "(name,created_time)values(?,?)");
            ){
                statement.setString(1,memoGroup.getName());
                statement.setTimestamp(2, Timestamp.valueOf(memoGroup.getCreatedTime()));
                int effect=statement.executeUpdate();
                return effect==1;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static List<MemoGroup> queryMemoGroupById(Integer id){
        List<MemoGroup> list=new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/memo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8");
                PreparedStatement statement=connection.prepareStatement("select id , name , created_time" +
                        "  ,modify_time from memo_group where id=?")
            ){
                statement.setInt(1,id);
                try(ResultSet resultSet=statement.executeQuery()){
                    while (resultSet.next()){
                        MemoGroup memoGroup=new MemoGroup();
                        memoGroup.setId(resultSet.getInt("id"));
                        memoGroup.setName(resultSet.getString("name"));
                        memoGroup.setCreatedTime(resultSet.getTimestamp("created_time").toLocalDateTime());
                        memoGroup.setModifyTime(resultSet.getTimestamp("modify_time").toLocalDateTime());
                        list.add(memoGroup);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }
    public static Boolean updateMemoGroup(MemoGroup memoGroup,String newName){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try(
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/memo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8");
                    PreparedStatement statement=connection.prepareStatement("update memo_group set name =? where name=?")
            ){
                statement.setString(1,newName);
                statement.setString(2, memoGroup.getName());
                int effect=statement.executeUpdate();
                return effect==1;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    public static int deleteMemoGroupByName(String name){
        int row=0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try(
                    Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/memo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8");
                    PreparedStatement statement=connection.prepareStatement("delete from memo_group where name=?" )
            ){
                statement.setString(1,name);
                 row=statement.executeUpdate();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return row;
    }
    public static boolean createMemoInfo(MemoGroup memoGroup,MemoInfo memoInfo){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/memo?user=root&password=123456&useUnicode=true&characterEncoding=UTF-8";
            connection=DriverManager.getConnection(url);
            connection.setAutoCommit(false);
            String memoGroupInsertSql="insert into memo_group(id,name,created_time) values (?,?,?)";
            String memoInfoInsertSql="insert into memo_info(id,group_id,title,content,created_time) values (?,?,?,?,?)";
            int effectA=1;
            int effectB=1;
            try (PreparedStatement statement=connection.prepareStatement(memoGroupInsertSql);){
                statement.setInt(1,memoGroup.getId());
                statement.setString(2,memoGroup.getName());
                statement.setTimestamp(3,Timestamp.valueOf(memoGroup.getCreatedTime()));
                effectA=statement.executeUpdate();
            }
            try (PreparedStatement statement=connection.prepareStatement(memoInfoInsertSql);){
                statement.setInt(1,memoInfo.getId());
                statement.setInt(2,memoInfo.getGroupId());
                statement.setString(3,memoInfo.getTitle());
                statement.setString(4,memoInfo.getContent());
                statement.setTimestamp(5,Timestamp.valueOf(memoGroup.getCreatedTime()));
                effectB=statement.executeUpdate();
            }
            if(effectA==1&&effectB==1){
                connection.commit();
                return true;
            }else {
                connection.rollback();
                return false;
            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(connection !=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return false;
    }
}
