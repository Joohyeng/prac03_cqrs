package com.example.ex01_command.api;

import com.example.ex01_command.api.model.Ex01Dto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ex01")
@RequiredArgsConstructor
public class Ex01Controller {
    private final Ex01Service ex01Service;

    @PostMapping("/reg")
    public ResponseEntity register(@RequestHeader(name="X-User-Idx") Long userIdx,
                                   @RequestHeader(name="X-User-Name") String userName,
                                   @RequestBody Ex01Dto.Ex01Req dto){
        ex01Service.reg(userIdx,userName,dto);
    }
}
