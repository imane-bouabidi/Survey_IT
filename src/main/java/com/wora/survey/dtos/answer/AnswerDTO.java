package com.wora.survey.dtos.answer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerDTO {
    private Integer id;
    private String text;
    private Integer selectionCount;
}

