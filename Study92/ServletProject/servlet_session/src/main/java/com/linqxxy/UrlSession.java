package com.linqxxy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns ="UrlSession")

public class UrlSession extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse respone) throws ServletException, IOException {
        this.doPost(request,respone);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        //测试Session
        HttpSession httpSession = request.getSession(true);
        out.append("<html>")
                .append("<head><title>CookieServletDemo</title></head>")
                .append("<body>")
                .append("sessionId"+httpSession.getId()+"</br>")
                .append("</body>")
                .append("</html>");

    }
}
