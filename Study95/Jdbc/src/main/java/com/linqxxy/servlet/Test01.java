package com.linqxxy.servlet;

import com.linqxxy.tools.DBManager;
import com.linqxxy.ov.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

public class Test01 {
    public static void main(String[] args) {
        DBManager dbManager=new DBManager();
        dbManager.getConnection();
        LinkedList<Employee> list=new LinkedList<>();
        try {
            ResultSet rs=dbManager.queryMethod("select * from employee");
            while (rs!=null&&rs.next()){
                Employee employee=new Employee();
                employee.setDepartNum(rs.getInt("departNum"));
                employee.setEmployeeName(rs.getString("employeeName"));
                employee.setEmployeeId(rs.getInt("employeeId"));
                list.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        dbManager.closeDb();
        for (Employee e:list
             ) {
            System.out.println(e.toString());
        }
    }
}
