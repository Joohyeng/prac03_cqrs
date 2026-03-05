package com.example.reply_query.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Reply {
    @Id
    private Long idx;
    private String contents;


    Long userIdx;
    String userName;
    Long boardIdx;
    String boardTitle;
}
