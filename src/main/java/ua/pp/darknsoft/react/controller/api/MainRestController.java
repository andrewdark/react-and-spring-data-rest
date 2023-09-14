package ua.pp.darknsoft.react.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.pp.darknsoft.react.model.Employee;
import ua.pp.darknsoft.react.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainRestController {

    private final EmployeeService employeeService;

    public MainRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAll(){
        return ResponseEntity.ok(employeeService.getAll());
    }
}
