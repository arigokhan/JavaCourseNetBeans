/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.test;

import javacourse.mdtekwill.employeeexercise.domain.Department;
import javacourse.mdtekwill.employeeexercise.domain.Employee;
import javacourse.mdtekwill.employeeexercise.service.impl.EmployeeServiceImpl;

/**
 *
 * @author Dell
 */
public class TestEmployee {
    public static void main(String[] args) {
        EmployeeServiceImpl employeeService= new EmployeeServiceImpl();
        Department itDepartment = new Department("IT");
        Employee employee1= new Employee("Ion","Paunescu",itDepartment);
//
//
        Employee savedEmployee = employeeService.create(employee1);
        //employeeService.update(employee1.getId(),employeeToUpdate);
        System.out.println(employeeService.read(savedEmployee.getId()));



        //UPDATE
//        Employee updatedEmployee= new Employee("Vasile","Paunescu",itDepartment);
//        boolean hasBennUpdated = employeeService.update(10,updatedEmployee);
//        System.out.println(employeeService.read(savedEmployee.getId()) + "has been updated: " + hasBennUpdated);
//
//
        //DELETE
//        employeeService.delete(savedEmployee.getId());
//        System.out.println(employeeService.printEmployee());

//        JFrame frame = new JFrame("Employee");
//        frame.setContentPane(new Employee().panel1);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.pack();
//        frame.setVisible(true);



    }
}
