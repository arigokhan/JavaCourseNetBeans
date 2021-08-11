/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.service.impl;

import java.util.Arrays;
import java.util.HashMap;
import javacourse.mdtekwill.employeeexercise.dao.impl.DepartmentDaoImpl;
import javacourse.mdtekwill.employeeexercise.dao.impl.EmployeeDaoImplArrayList;
import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;
import javacourse.mdtekwill.employeeexercise.service.EmployeeService;

/**
 *
 * @author Dell
 */
public class EmployeeServiceImpl implements EmployeeService {

    //private EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
    private EmployeeDaoImplArrayList employeeDao = new EmployeeDaoImplArrayList();
    private DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();

    @Override
    public Employee create(Employee employee) {
        if (departmentDao.read(employee.getDepartment().getName()) == null) {
            System.out.println("Departamentul nu este gasit!!!");
            return null;
        }
        return employeeDao.create(employee);
    }

    @Override
    public Employee read(long employeeId) {
        return employeeDao.read(employeeId);
    }

    @Override
    public boolean update(long employeeId, String firstName, String lastName, Department department) {
        return employeeDao.update(employeeId, firstName, lastName, department);

    }
    
    @Override
    public boolean update(long employeeId, HashMap<String, String> employeeDetailsMap, Department department) {
        return employeeDao.update(employeeId, employeeDetailsMap, department);

    }

    @Override
    public void delete(long employeeId) {
        employeeDao.delete(employeeId);
    }

    public Employee[] getEmployees() {
        return employeeDao.getEmployees();
    }

    public String printEmployee() {
        return Arrays.toString(getEmployees());
    }
}
