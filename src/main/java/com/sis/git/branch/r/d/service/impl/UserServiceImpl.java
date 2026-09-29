package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.UserDto;
import com.sis.git.branch.r.d.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDto> getAll() {
        return List.of(null);
    }
}
