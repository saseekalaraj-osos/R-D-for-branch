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
<<<<<<< HEAD
        List<StockDto> stockDtos = new ArrayList<>();//added some memory allocation
=======
        List<StockDto> stockDtos = new ArrayList<>();//ydsyt7dtsydty
>>>>>>> 7bb7014b7f6d03fe3651073b41a28fb7557058df
        return stockDtos;
    }
}//jdgsudsudyuydusdu
