CREATE DATABASE IF NOT EXISTS test;
USE test;

CREATE TABLE IF NOT EXISTS employee(
    id int auto_increment primary key,
    name varchar(100),
    salary double(10, 2),
    job varchar(100)
);

INSERT INTO employee(name, salary, job) VALUES ('佟湘玉', 8000.00, '掌柜');
INSERT INTO employee(name, salary, job) VALUES ('白展堂', 7000.00, '跑堂');
INSERT INTO employee(name, salary, job) VALUES ('李大嘴', 1000.00, '初始');
INSERT INTO employee(name, salary, job) VALUES ('吕秀才', 10000.00, '会计');
INSERT INTO employee(name, salary, job) VALUES ('郭芙蓉', 9000.00, '打杂');

CREATE TABLE IF NOT EXISTS admin(
    username varchar(100) primary key not null,
    name varchar(100) not null,
    password varchar(20) not null,
    int sex,
);

INSERT INTO admin(username, name, password, sex) VALUES ('test', 'testname', '111111', 1);