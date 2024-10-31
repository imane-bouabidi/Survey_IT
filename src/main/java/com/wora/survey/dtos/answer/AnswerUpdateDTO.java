package com.wora.survey.dtos.answer;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerUpdateDTO {
    private Integer id;
    @NotBlank
    private String text;

    private Integer selectionCount;
}
