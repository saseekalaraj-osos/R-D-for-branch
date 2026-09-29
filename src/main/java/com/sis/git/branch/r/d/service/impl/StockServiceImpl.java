package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.StockDto;
import com.sis.git.branch.r.d.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    @Override
    public List<StockDto> getAll() {
        return List.of(null);
    }
}
