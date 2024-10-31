package com.wora.survey.dtos.answer;

import jakarta.validation.constraints.NotBlank;

public class AnswerUpdateDTO {
    @NotBlank
    private String text;

    private Integer selectionCount;
}
