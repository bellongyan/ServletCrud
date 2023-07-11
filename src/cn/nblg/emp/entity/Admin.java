package cn.nblg.emp.entity;

public class Admin {
    private String username;
    private String name;
    private String password;
    private int sex;

    public Admin() {
    }

    public Admin(String username, String name, String password, int sex) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }
}
