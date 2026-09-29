package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.LeaveDto;
import com.sis.git.branch.r.d.service.LeaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/leave")
@RequiredArgsConstructor
public class LeaveController {

    private LeaveService leaveService;

    @GetMapping()
    public List<LeaveDto> getAll() {
        return leaveService.getAll();
    }
}
