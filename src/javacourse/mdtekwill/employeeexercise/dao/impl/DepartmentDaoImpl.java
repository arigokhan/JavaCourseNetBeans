/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.dao.impl;

import javacourse.mdtekwill.employeeexercise.dao.DepartmentDao;
import javacourse.mdtekwill.employeeexercise.domain.Department;

/**
 *
 * @author Asus
 */
public class DepartmentDaoImpl implements DepartmentDao {
    private static Department[] departments = {new Department("IT"), new Department("HR")};

    @Override
    public Department read(String name) {
        for (int i = 0; i < departments.length; i++) {
            if(departments[i].getName().equals(name)){
                return departments[i];
            }
        }
        return null;
    }
    
  
}
