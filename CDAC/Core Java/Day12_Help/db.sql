CREATE DATABASE dkte_db;

USE dkte_db;

CREATE TABLE employees(
    empid INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(15),
    salary DOUBLE,
    dept VARCHAR(40)
);

SELECT * FROM employees;

INSERT INTO employees(name,salary,dept) VALUES("Anil",10000,"Operations");
INSERT INTO employees(name,salary,dept) VALUES("Mukesh",20000,"Development");