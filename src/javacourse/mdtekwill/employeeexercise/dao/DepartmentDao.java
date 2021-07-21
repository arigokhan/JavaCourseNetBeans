/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.dao;

import javacourse.mdtekwill.employeeexercise.domain.Department;

/**
 *
 * @author Asus
 */
public interface DepartmentDao {
   public Department read(String name);
}
