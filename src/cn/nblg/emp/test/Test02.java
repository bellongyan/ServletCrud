package cn.nblg.emp.test;

import cn.nblg.emp.dao.AdminDao;
import cn.nblg.emp.dao.AdminDaoImpl;
import cn.nblg.emp.entity.Admin;
import org.junit.Test;

public class Test02 {
    @Test
    public void TestLogin() {
        String username = "test";
        String password = "000000";
        AdminDao adminDao = new AdminDaoImpl();
        Admin admin = adminDao.login(username, password);
        System.out.println(admin.getUsername() + "\t" + admin.getPassword() + "\t" + admin.getName() + "\t" + admin.getSex());
    }

    @Test
    public void TestRegister() {
        String username = "test3";
        String name = "testname3";
        String password = "000000";
        int sex = 0;
        AdminDao adminDao = new AdminDaoImpl();
        System.out.println(adminDao.register(username, name, password, sex));
    }
}
