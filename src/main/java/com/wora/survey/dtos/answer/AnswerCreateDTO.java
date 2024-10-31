package com.wora.survey.dtos.answer;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerCreateDTO {
    @NotBlank
    private String text;
    private Integer questionId;
}

