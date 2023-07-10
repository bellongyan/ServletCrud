package cn.nblg.emp.servlet;

import cn.nblg.emp.dao.EmpDao;
import cn.nblg.emp.dao.EmpDaoImpl;
import cn.nblg.emp.entity.Emp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/load")
public class LoadServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        EmpDao dao = new EmpDaoImpl();
        Emp emp = dao.findByID(id);
        req.setAttribute("emp", emp);
        req.getRequestDispatcher("updateEmp.jsp").forward(req, resp);
    }
}
