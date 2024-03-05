package com.springboot.postgres.mapper;

import com.springboot.postgres.dto.EmployeeDto;
import com.springboot.postgres.entity.Employee;



public class EmployeeMapper {
    public static EmployeeDto toEmployeeDto(Employee employee) {
        return new EmployeeDto(employee.getId(), employee.getName(), employee.getEmail(), employee.getAddress());
    }
    public static Employee toEmployee(EmployeeDto employeeDto) {
        return new Employee(employeeDto.getId(), employeeDto.getName(), employeeDto.getEmail(), employeeDto.getAddress());
    }
}
