package com.wora.survey.dtos.answer;

import jakarta.validation.constraints.NotBlank;

public class AnswerCreateDTO {
    @NotBlank
    private String text;
    private Integer questionId;
}

