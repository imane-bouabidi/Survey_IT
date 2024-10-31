package com.wora.survey.dtos.question;

import com.wora.survey.entities.eums.QuestionType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmbeddedQuestionDTO {
    private Integer id;
    private String text;
    private QuestionType type;

}
