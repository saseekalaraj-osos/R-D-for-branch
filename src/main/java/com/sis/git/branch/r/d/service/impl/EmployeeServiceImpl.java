package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.EmployeeDto;
import com.sis.git.branch.r.d.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<EmployeeDto> getAll() {
        return List.of(null);
    }
}
