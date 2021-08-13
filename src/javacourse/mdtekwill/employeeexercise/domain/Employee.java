/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacourse.mdtekwill.employeeexercise.domain;

import java.time.LocalDateTime;


/**
 *
 * @author Dell
 */
public class Employee {

    private long id;
    private String firstName;
    private String lastName;
    private Department department;
    private static long idCount;
    private LocalDateTime creationDate;
    private LocalDateTime updateDate;

    public Employee(String firstName, String lastName, Department department) {
        id = ++idCount;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public Employee() {
        id = ++idCount;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
    
    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", firstName='" + firstName + '\''
                + ", lastName='" + lastName + '\''
                + ", department=" + department
                + '}';
    }

}
