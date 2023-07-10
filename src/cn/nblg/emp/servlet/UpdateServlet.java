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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req,
                           HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        double salary = Double.parseDouble(req.getParameter("salary"));
        String job = req.getParameter("job");

        EmpDao dao = new EmpDaoImpl();
        Emp emp = new Emp(id, name, salary, job);
        dao.updateById(emp);

        resp.sendRedirect("list");
    }
}
