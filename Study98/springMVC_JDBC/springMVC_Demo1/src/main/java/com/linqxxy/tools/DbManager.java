package com.linqxxy.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbManager {

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/wwh";
    private String username = "root";
    private String password = "123456";

    private Connection conn = null;
    private Statement state = null;
    private ResultSet rs = null;

    public Connection getConnection(){
        try {
            Class.forName(driver);
            System.out.println("******************");
            conn = DriverManager.getConnection(url,username,password);
            return conn;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }

    public ResultSet queryExecute(String strSql){
        try {
            conn = this.getConnection();
            state = conn.createStatement();
            rs = state.executeQuery(strSql);
            return rs;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return rs;
    }
}
