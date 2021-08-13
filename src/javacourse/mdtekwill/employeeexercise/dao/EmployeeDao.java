/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.dao;

import java.time.LocalDateTime;
import java.util.HashMap;
import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;

/**
 *
 * @author Asus
 */
public interface EmployeeDao {

    public Employee create(Employee employee);

    public Employee read(long employeeId);

    public boolean update(long employeeId, String firstName, String lastName, Department department);
    
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department);
    
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department, LocalDateTime updateDate);

    public void delete(long employeeId);
}
