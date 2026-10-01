package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.OrderDto;
import com.sis.git.branch.r.d.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private OrderService orderService;

    @GetMapping()
    public List<OrderDto> getAll() {
        return orderService.getAll();
    }
}
