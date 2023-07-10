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
import java.util.List;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 通过dao和数据库交互，得到一个集合
        EmpDao dao = new EmpDaoImpl();
        List<Emp> emps = dao.findALL();
        // 将集合绑定到请求对的中，再向下一个servlet发送请求,emplist.jsp
        req.setAttribute("emps", emps);
        req.getRequestDispatcher("emplist.jsp").forward(req, resp);
    }
}
