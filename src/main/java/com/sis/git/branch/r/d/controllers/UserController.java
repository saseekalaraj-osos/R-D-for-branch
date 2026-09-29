package com.sis.git.branch.r.d.controllers;

import com.sis.git.branch.r.d.dtos.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping()
    public List<UserDto> getAll() {
        return null;
    }
}
