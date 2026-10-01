package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.CashDto;
import com.sis.git.branch.r.d.service.CashService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CashServiceImpl implements CashService {
    @Override
    public List<CashDto> getAll() {
        return List.of(null);
    }
}
