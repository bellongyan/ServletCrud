package cn.nblg.emp.dao;

import cn.nblg.emp.entity.Admin;
import cn.nblg.emp.entity.Emp;
import cn.nblg.emp.util.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminDaoImpl implements AdminDao {

    @Override
    public Admin login(String username, String password) {
        Connection con = DbUtil.getCon();
        PreparedStatement pst = null;
        ResultSet rs = null;
        Admin admin = null;
        String sql = "select * from admin where username = ? and password = ?;";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            rs = pst.executeQuery();
            while (rs.next()) {
                String name = rs.getString("NAME");
                int sex = rs.getInt("SEX");
                admin = new Admin(username, name, password, sex);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtil.closeCon(con);
        }
        return admin;
    }

    @Override
    public boolean register(String username, String name, String password, int sex) {
        boolean flag = true;

        Connection con = DbUtil.getCon();
        PreparedStatement pst = null;
        String sql = "insert into admin(username, name, password, sex) values(?,?,?,?)"; // 防止SQL注入
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, name);
            pst.setString(3, password);
            pst.setInt(4, sex);
            pst.executeUpdate();
        } catch (SQLException e) {
            flag = false;
            throw new RuntimeException(e);
        } finally {
            DbUtil.closeCon(con);
        }
        return flag;
    }
}
