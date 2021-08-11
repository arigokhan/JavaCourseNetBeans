/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.service;

import java.util.HashMap;
import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;

/**
 *
 * @author Dell
 */
public interface EmployeeService {

    public Employee create(Employee employee);

    public Employee read(long employeeId);

    public boolean update(long employeeId, String firstName, String lastName, Department department);
    
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department);

    public void delete(long employeeId);
}
