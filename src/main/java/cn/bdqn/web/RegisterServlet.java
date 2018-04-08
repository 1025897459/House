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

@WebServlet(name = "RegisterServlet",urlPatterns = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        String telephone=request.getParameter("telephone");
        String username=request.getParameter("username");
        Users users=new Users();
        users.setName(name);
        users.setPassword(password);
        users.setTelephone(telephone);
        users.setUsername(username);
        UserService userService=new UserServiceImpl();
        boolean flag = userService.addUser(users);
        if (flag){
            response.sendRedirect("page/success.jsp");

        }else {
            response.sendRedirect("page/register.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
