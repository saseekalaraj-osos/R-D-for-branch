package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.OrderDto;
import com.sis.git.branch.r.d.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    @Override
    public List<OrderDto> getAll() {
        return List.of(null);
    }
}
