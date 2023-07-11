package cn.nblg.emp.servlet;

import cn.nblg.emp.dao.AdminDao;
import cn.nblg.emp.dao.AdminDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String name = req.getParameter("name");
        String pwd = req.getParameter("pwd");
        String sSex = req.getParameter("sex");
        int sex = 1;
        if (sSex.equals("f")) {
            sex = 0;
        }

        AdminDao adminDao = new AdminDaoImpl();
        boolean flag = adminDao.register(username, name, pwd, sex);
        //System.out.println(flag);
        if (flag == false) {
            resp.sendRedirect("fail.jsp");
        } else {
            resp.sendRedirect("login.html");
        }
    }
}
