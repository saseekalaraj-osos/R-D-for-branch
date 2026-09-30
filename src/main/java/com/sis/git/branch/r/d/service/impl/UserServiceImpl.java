package com.sis.git.branch.r.d.service.impl;

import com.sis.git.branch.r.d.dtos.UserDto;
import com.sis.git.branch.r.d.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDto> getAll() {
        List<UserDto> userDtos = new ArrayList<>();
        UserDto userDto = new UserDto();
        userDto.setAge("25");
        userDto.setName("Naveen");
        return List.of(null);
    }
}
