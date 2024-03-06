package com.springboot.postgres.service.impl;

import com.springboot.postgres.dto.EmployeeDto;
import com.springboot.postgres.entity.Employee;
import com.springboot.postgres.mapper.EmployeeMapper;
import com.springboot.postgres.repository.EmployeeRepository;
import com.springboot.postgres.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.toEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.toEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
        return EmployeeMapper.toEmployeeDto(employee);
    }
}
