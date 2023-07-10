package cn.nblg.emp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
    /*
    获得连接
     */
    public static Connection getCon() {
        Connection con = null;
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "password";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }

    /*
    关闭连接
     */
    public static void closeCon(Connection con) {
        if (con != null) {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
