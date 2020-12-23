package com.test.springboot.Dao;

import com.test.springboot.Entities.Department;
import com.test.springboot.Entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employees = null;

    @Autowired
    private DepartmentDao departmentDao;

    static{
        employees = new HashMap<Integer,Employee>();

        employees.put(1001,new Employee(1001,"e-aa","aa@163.com",1,new Department(101,"d-aa")));
        employees.put(1002,new Employee(1002,"e-bb","bb@163.com",1,new Department(102,"d-bb")));
        employees.put(1003,new Employee(1003,"e-cc","cc@163.com",0,new Department(103,"d-cc")));
        employees.put(1004,new Employee(1004,"e-dd","dd@163.com",1,new Department(104,"d-dd")));
        employees.put(1005,new Employee(1005,"e-ee","ee@163.com",0,new Department(105,"d-ee")));
    }

}

