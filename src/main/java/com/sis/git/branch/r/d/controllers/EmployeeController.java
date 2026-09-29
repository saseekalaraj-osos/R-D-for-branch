package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.EmployeeDto;
import com.sis.git.branch.r.d.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping()
    public List<EmployeeDto> getAll() {
        return employeeService.getAll();
    }
}
