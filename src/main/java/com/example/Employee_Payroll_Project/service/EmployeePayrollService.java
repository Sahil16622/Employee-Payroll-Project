package com.example.Employee_Payroll_Project.service;



import java.util.ArrayList;
import java.util.List;

public class EmployeePayrollService implements IEmployeePayrollService {
    private List<String> employees = new ArrayList<>();

    @Override
    public List<String> getAllEmployees() {
        return employees;
    }

    @Override
    public String getEmployeeById(int id) {
        return employees.get(id);
    }

    @Override
    public String createEmployee(String employee) {
        employees.add(employee);
        return "Employee added successfully";
    }

    @Override
    public String updateEmployee(int id, String employee) {
        employees.set(id, employee);
        return "Employee updated successfully";
    }

    @Override
    public String deleteEmployee(int id) {
        employees.remove(id);
        return "Employee deleted successfully";
    }

}
