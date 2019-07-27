package com.linqxxy.servlet;

import com.linqxxy.ov.Group;
import com.linqxxy.ov.UserInfo;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/elServlet")
public class ELServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        request.setAttribute("strKey","linqxxy");
        request.setAttribute("strKey", "what!");

        // 测试结构体
        Group group = new Group();
        group.setgName("RockClass");

        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("Liu");
        userInfo.setGroup(group);
        request.setAttribute("userInfoKey",userInfo);

        //  测试字符数组
        String[] strArr = new String[]{"aa","bb","cc","dd"};
        request.setAttribute("strArrKey", strArr);

        // 测试自定义数组
        UserInfo[] userInfos = new UserInfo[5];
        for (int i = 0; i < userInfos.length; i++) {
            UserInfo userInf = new UserInfo();
            userInf.setUsername("U_"+i);
            userInfos[i] = userInf;
        }
        request.setAttribute("userInfosKey",userInfos);
        request.getRequestDispatcher("jstl_el.jsp").forward(request,response);
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
