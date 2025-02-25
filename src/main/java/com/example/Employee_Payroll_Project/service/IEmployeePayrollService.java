package com.example.Employee_Payroll_Project.service;



import java.util.List;

public interface IEmployeePayrollService {
    List<String> getAllEmployees();
    String getEmployeeById(int id);
    String createEmployee(String employee);
    String updateEmployee(int id, String employee);
    String deleteEmployee(int id);

}
