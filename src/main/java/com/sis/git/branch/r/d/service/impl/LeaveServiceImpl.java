package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.LeaveDto;
import com.sis.git.branch.r.d.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LeaveServiceImpl implements LeaveService {
    @Override
    public List<LeaveDto> getAll() {
        return List.of(null);
    }
}
