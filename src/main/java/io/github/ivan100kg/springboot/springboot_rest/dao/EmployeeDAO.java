package io.github.ivan100kg.springboot.springboot_rest.dao;

import io.github.ivan100kg.springboot.springboot_rest.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

//    public void saveEmployee(Employee employee);
//
//    public Employee getEmployee(int id);
//
//    void deleteEmployee(int id);
}
