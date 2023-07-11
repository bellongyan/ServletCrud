package cn.nblg.emp.dao;

import cn.nblg.emp.entity.Admin;

public interface AdminDao {
    public Admin login(String username, String password);

    public boolean register(String username, String name, String password, int sex);
}
