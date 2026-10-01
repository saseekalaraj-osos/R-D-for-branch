package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.StockDto;
import com.sis.git.branch.r.d.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockServiceImpl implements StockService {
    @Override
    public List<StockDto> getAll() {
        List<StockDto> stockDtos = new ArrayList<>();//added some memory allocation
        return stockDtos;
    }
}//jdgsudsudyuydusdu
