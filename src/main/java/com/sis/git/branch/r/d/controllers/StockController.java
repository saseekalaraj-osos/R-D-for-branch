package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.StockDto;
import com.sis.git.branch.r.d.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

    private StockService stockService;

    @GetMapping()
    public List<StockDto> getAll() {
        return stockService.getAll();
    }
}
