package com.wora.survey.dtos.question;

import com.wora.survey.entities.eums.QuestionType;
import jakarta.validation.constraints.NotBlank;

public class QuestionUpdateDTO {
    @NotBlank
    private String text;

    private QuestionType type;

    private Integer subjectId;
}

