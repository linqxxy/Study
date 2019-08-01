package com.linqxxy.dao;

import com.linqxxy.tools.DBManager;
import com.linqxxy.ov.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserInfoDao {
    public int checkUserInfo(Employee employee){
        int flag=0;
        String str1="select * from employee";
        DBManager dbManager=new DBManager();
        ResultSet rs=dbManager.queryMethod(str1);
        int employeeId=0;
        String employeeName=null;
        try {
            while (rs.next()){
                employeeId=rs.getInt("employeeId");
                employeeName=rs.getString("employeeName");
                if (employeeId==employee.getEmployeeId()&&employeeName.equals(employee.getEmployeeName())){
                    flag=1;
                    return flag;
                }else {
                    flag=0;
                }
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        dbManager.closeDb();
        return flag;
    }
}
