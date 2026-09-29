package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.CustomerDto;
import com.sis.git.branch.r.d.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @GetMapping()
    public List<CustomerDto> getAll() {
        return customerService.getAll();
    }
}
