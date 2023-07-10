package cn.nblg.emp.test;

import cn.nblg.emp.dao.EmpDao;
import cn.nblg.emp.dao.EmpDaoImpl;
import cn.nblg.emp.entity.Emp;
import cn.nblg.emp.util.DbUtil;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class Test01 {
    @Test
    public void testDbUtil() {
        Connection con = DbUtil.getCon();
        System.out.println(con);
    }

    @Test
    public void testFindAll() {
        EmpDaoImpl dao = new EmpDaoImpl();
        List<Emp> emps = dao.findALL();
        for (Emp e : emps) {
            System.out.println(e.getId() + ", " + e.getName() + ", " + e.getSalary() + ", " + e.getJob());
        }
    }

    @Test
    public void testAddEmp() {
        EmpDao dao = new EmpDaoImpl();
        Emp emp = new Emp("邢捕头", 5000.0, "捕快");
        boolean b = dao.save(emp);
        System.out.println(b);
    }

    @Test
    public void testDeleteEmp() {
        EmpDao dao = new EmpDaoImpl();
        int id = 14;
        dao.deleteById(id);
    }

    @Test
    public void testUpdateEmp() {
        EmpDao dao = new EmpDaoImpl();
        Emp emp = new Emp(5, "郭芙蓉", 9000.00, "打杂");
        dao.updateById(emp);
    }

    @Test
    public void testFindById() {
        EmpDao dao = new EmpDaoImpl();
        Emp emp = dao.findByID(1);
        System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getSalary() + ", " + emp.getJob());
    }
}
