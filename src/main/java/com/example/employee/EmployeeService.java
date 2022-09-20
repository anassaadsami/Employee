package com.example.employee;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeService {
   private static int index = 3;
    private static Map<Integer, Employee> employees = new HashMap<>();

    static {
        Employee emp1 = new Employee(1,"anas", 500);
        Employee emp2 = new Employee(2, "ali", 600);
        Employee emp3 = new Employee(3, "hiba", 700);
        employees.put(1, emp1);
        employees.put(2, emp2);
        employees.put(3, emp3);

    }

    public List<Employee> getAllEmployees() {
        // return employees;
        return new ArrayList<>(employees.values());
    }

    public Employee getEmployee(int empId) {
        return employees.get(empId);
    }

    public void addEmployee(Employee employee) {
        employees.put( index++, employee);
    }

    public void updateEmployeeByIndex(int index, Employee employee) {
        employees.put(index,employee);

    }
    public void deleteEmployeeByIndex(int index){
        employees.remove(index);
    }

}