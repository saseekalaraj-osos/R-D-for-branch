package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.CustomerDto;
import com.sis.git.branch.r.d.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<CustomerDto> getAll() {
        return List.of(null);
    }
}
