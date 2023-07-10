package cn.nblg.emp.entity;

public class Emp {
    private int id;
    private String name;
    private double salary;
    private String job;

    public Emp() {
    }

    public Emp(int id) {
        this.id = id;
    }

    public Emp(String name, double salary, String job) {
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    public Emp(int id, String name, double salary, String job) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
