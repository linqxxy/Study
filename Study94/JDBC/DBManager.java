package com.linqxxy.JDBC;

import java.sql.*;

public class DBManager {
    private Connection conn = null;
    private Statement state = null;
    private ResultSet res = null;
    private String username = "root";
    private String password = "123456";
    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/shop";

    public Connection getConnection(){
        try {
            Class.forName(driver);
            System.out.println("联系商家");
            conn = DriverManager.getConnection(url,username,password);
            System.out.println("订单已下，等待发货");
            return conn;
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return  conn;
    }

    public int nonQueryMethod(String strSql) {
        int flag = 0;
        try {
            conn = this.getConnection();
            state = conn.createStatement();
            flag = state.executeUpdate(strSql);
            return flag;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public ResultSet queryMethod(String strSql) {

        try {
            conn = this.getConnection();
            state = conn.createStatement();
            res = state.executeQuery(strSql);
            return res;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return res;
    }

    public void closeDb() {
        try {
            if (res != null) res.close();
            if (state != null) state.close();
            if (conn != null) conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
