package com.linqxxy.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbManager {
    private String username="root";
    private String password="123456";
    private String url="jdbc:mysql://localhost:3306/wwh?useSSL=false";
    private String driver="com.mysql.jdbc.Driver";

    private Connection conn=null;
    private Statement state=null;
    private ResultSet rs=null;

    private Connection getConnection(){
        try{
            Class.forName(driver);
            conn= DriverManager.getConnection(url,username,password);
            return conn;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
    public ResultSet queryExcecute(String strSql){
        try {
            conn=this.getConnection();
            state=conn.createStatement();
            rs=state.executeQuery(strSql);
            return rs;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
}
