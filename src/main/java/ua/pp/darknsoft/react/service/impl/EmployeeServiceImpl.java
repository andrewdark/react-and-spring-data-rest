package ua.pp.darknsoft.react.service.impl;

import org.springframework.stereotype.Service;
import ua.pp.darknsoft.react.model.Employee;
import ua.pp.darknsoft.react.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> getAll() {
        List<Employee> employees = new ArrayList<>();
        Employee em1 = new Employee("Jon","Don", "Jon Don-Don");
        employees.add(em1);
        Employee em2 = new Employee("Bon","Boson", "Bon Booba Son");
        employees.add(em2);
        Employee em3 = new Employee("Don","Perignyon", "Ron-don-don");
        employees.add(em3);
        return employees;
    }
}
