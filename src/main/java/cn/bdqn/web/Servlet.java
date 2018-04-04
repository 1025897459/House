package cn.bdqn.web;

import cn.bdqn.entity.Users;
import cn.bdqn.service.UserService;
import cn.bdqn.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet",urlPatterns = "/Servlet")
public class Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        String pwd = request.getParameter("password");
        Users users = new Users();
        users.setUsername(name);
        users.setPassword(pwd);
        UserService userService = new UserServiceImpl();
        boolean flag = userService.getUser(users);
        if(flag){
            request.getRequestDispatcher("login_struts2.jsp").forward(request,response);
        }else{
            response.sendRedirect("show.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
