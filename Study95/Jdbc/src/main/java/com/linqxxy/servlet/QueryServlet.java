package com.linqxxy.servlet;

import com.linqxxy.model.IUserInfoService;
import com.linqxxy.model.UserInfoService;
import com.linqxxy.ov.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/QueryServlet")
public class QueryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //获取表单参数
        String employeeId=request.getParameter("employeeId");
        String employeeName=request.getParameter("employeeName");
        Employee employee=new Employee();
        employee.setEmployeeId(Integer.parseInt(employeeId));
        employee.setEmployeeName(employeeName);

        //调用业务逻辑
        IUserInfoService iUserInfoService=new UserInfoService();
        int flag=iUserInfoService.checkUserInfoService(employee);
        if (flag==1){
            request.setAttribute("userInfoKey",employee);

            //转向
            request.getRequestDispatcher("success.jsp").forward(request,response);
        }else {

            //转向
            request.getRequestDispatcher("failure.jsp").forward(request,response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
