package com.example.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmloyeeController {
@Autowired
    EmployeeService employeeService;

    @GetMapping("/allEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @GetMapping("/{index}")
    public Employee getEmployeeIndex(@PathVariable int index){
        return employeeService.getEmployee(index);
    }
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeService.getAllEmployees().add(employee);
        return employee ;
    }

    @PutMapping("/updateEmployeeByIndex/{index}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int index){
        employeeService.updateEmployeeByIndex( index , employee);
        return "employee is updated";
    }


}
