package com.developer.vignesh.batch.config;

import com.developer.vignesh.batch.entity.Employee;
import org.springframework.batch.item.ItemProcessor;


public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {
    @Override
    public Employee process(Employee employee) throws Exception {
        return employee;
    }
}
