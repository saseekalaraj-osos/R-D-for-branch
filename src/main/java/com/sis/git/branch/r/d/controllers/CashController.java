package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.CashDto;
import com.sis.git.branch.r.d.service.CashService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cash")
@RequiredArgsConstructor
public class CashController {

    private CashService cashService;

    @GetMapping()
    public List<CashDto> getAll() {
        return cashService.getAll();
    }
}
// second change