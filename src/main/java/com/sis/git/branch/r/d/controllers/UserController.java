package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.UserDto;
import com.sis.git.branch.r.d.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping()
    public List<UserDto> getAll() {
        return userService.getAll();
    }
}
