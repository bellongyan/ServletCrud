package cn.nblg.emp.servlet;

import cn.nblg.emp.dao.AdminDao;
import cn.nblg.emp.dao.AdminDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("name");
        String password = req.getParameter("pwd");
        AdminDao adminDao = new AdminDaoImpl();
        if (adminDao.login(username, password) != null) {
            resp.sendRedirect("list");
        } else {
            resp.sendRedirect("fail.jsp");
        }

    }
}
