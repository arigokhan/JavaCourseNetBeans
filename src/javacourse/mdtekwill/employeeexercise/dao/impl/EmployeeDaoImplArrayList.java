/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.dao.impl;

import java.util.ArrayList;
import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;

/**
 *
 * @author Dell
 */
public class EmployeeDaoImplArrayList extends EmployeeDaoImpl {

    private static ArrayList<Employee> employeesArrayList = new ArrayList<Employee>();

    @Override
    public Employee create(Employee employee) {
        employeesArrayList.add(employee);

        return employee;
    }

    @Override
    public Employee read(long employeeId) {

        for (int i = 0; i < employeesArrayList.size(); i++) {
            Employee employee = employeesArrayList.get(i);
            if (employee != null && employee.getId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    @Override
    public void delete(long employeeId) {    
        Employee readEmployee = read(employeeId);

        if (readEmployee != null) {
             employeesArrayList.remove(readEmployee);
        }
    }

    @Override
    public Employee[] getEmployees() {
        return employeesArrayList.toArray(new Employee[employeesArrayList.size()]);          
    }

}
