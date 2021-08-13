/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.dao.impl;

import java.time.LocalDateTime;
import java.util.HashMap;
import javacourse.mdtekwill.employeeexercise.dao.EmployeeDao;
import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;

/**
 *
 * @author Asus
 */
public class EmployeeDaoImpl implements EmployeeDao {

    private static Employee[] employees = new Employee[30];
    private static int index = 0;

    @Override
    public Employee create(Employee employee) {
        employees[index] = employee;
        return employees[index++];
       
    }

    @Override
    public Employee read(long employeeId) {

        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public boolean update(long employeeId, String firstName, String lastName, Department department) {
        Employee readEmployee = read(employeeId);

        if (readEmployee != null) {
            readEmployee.setFirstName(firstName);
            readEmployee.setLastName(lastName);
            readEmployee.setDepartment(department);
            return true;
        }

        return false;
    }
    
    @Override
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department) {
        Employee readEmployee = read(employeeId);

        if (readEmployee != null) {
            readEmployee.setFirstName(employeeDetailsMap.get("firstName"));
            readEmployee.setLastName(employeeDetailsMap.get("lastName"));
            readEmployee.setDepartment(department);
            return true;
        }

        return false;
    }
    
      @Override
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department,LocalDateTime updateDate) {
        Employee readEmployee = read(employeeId);

        if (readEmployee != null) {
            readEmployee.setFirstName(employeeDetailsMap.get("firstName"));
            readEmployee.setLastName(employeeDetailsMap.get("lastName"));
            readEmployee.setUpdateDate(updateDate);
            readEmployee.setDepartment(department);
            return true;
        }

        return false;
    }

    @Override
    public void delete(long employeeId) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee != null && employee.getId() == employeeId) {
                employees[i] = null;
                System.out.println("Employee has been deleted! " + employee);
                break;
            }
        }

    }
}
