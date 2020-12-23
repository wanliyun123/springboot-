package com.test.springboot.Dao;

import com.test.springboot.Entities.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departments = null;

    static {
        departments = new HashMap<Integer, Department>();

        departments.put(101,new Department(101,"d-aa"));
        departments.put(102,new Department(102,"d-bb"));
        departments.put(103,new Department(103,"d—cc"));
        departments.put(104,new Department(104,"d-dd"));
        departments.put(105,new Department(105,"d-ee"));
    }
    public Collection<Department> getDepartments(){
        return departments.values();
    }
    public Department getDepartment(Integer id){
        return departments.get(id);
    }
}
