package com.example.Employee_Payroll_Project.controller;



import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employeepayrollservice")

public class EmployeePayrollController {
    private List<String> employees = new ArrayList<>();


    @GetMapping("/get")
    public ResponseEntity<List<String>> getAllEmployees() {
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable int id) {
        if (id >= 0 && id < employees.size()) {
            return ResponseEntity.ok(employees.get(id));
        }
        return ResponseEntity.badRequest().body("Employee not found");
    }

    @PostMapping("/create")
    public ResponseEntity<String> createEmployee(@RequestBody String employee) {
        employees.add(employee);
        return ResponseEntity.ok("Employee added successfully");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployee(@PathVariable int id, @RequestBody String employee) {
        if (id >= 0 && id < employees.size()) {
            employees.set(id, employee);
            return ResponseEntity.ok("Employee updated successfully");
        }
        return ResponseEntity.badRequest().body("Employee not found");
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id) {
        if (id >= 0 && id < employees.size()) {
            employees.remove(id);
            return ResponseEntity.ok("Employee deleted successfully");
        }
        return ResponseEntity.badRequest().body("Employee not found");
    }

}
