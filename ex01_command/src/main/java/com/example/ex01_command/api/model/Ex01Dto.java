package com.example.ex01_command.api.model;

import lombok.Builder;
import lombok.Getter;


public class Ex01Dto {
    public static class Ex01Req {
        private String title;
        private String contents;

        public Ex01 toEntity(Long idx, String name){
            return Ex01.builder()
                    .title(this.title)
                    .contents(this.contents)
                    .userIdx(idx)
                    .userName(name)
                    .build();
        }
    }
    public static class Ex01Res{
        private
    }
}
