package com.crud.emproject;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmpController {
    // List<Employee> employees = new ArrayList<>();
//    @Autowired
// EmployeeService employeeService=new EmployeeServiceImpl();

//dependcy Injection

@Autowired
EmployeeService employeeService;

   @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    // to create use get and to read use post
    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee) {
        // TODO: process POST request
        //employees.add(employee);

        return employeeService.createEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
      if(employeeService.deleteEmployee(id)){
        return "Delete Sucessfully";
      }
      return "NOt found";
      
    }

}
