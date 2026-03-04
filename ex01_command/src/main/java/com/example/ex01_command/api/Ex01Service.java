package com.example.ex01_command.api;

import com.example.ex01_command.api.model.Ex01Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Ex01Service {
    private final Ex01Repository ex01Repository;
    public Ex01Dto.Ex01Res reg(Long userIdx, String userName, Ex01Dto.Ex01Req dto) {
        ex01Repository.save();
    }
}
