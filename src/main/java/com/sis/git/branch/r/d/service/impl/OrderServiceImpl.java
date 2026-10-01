package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.OrderDto;
import com.sis.git.branch.r.d.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getAll() {
        List<OrderDto> orderDtos = new ArrayList<>();
        return orderDtos;
    }
}
