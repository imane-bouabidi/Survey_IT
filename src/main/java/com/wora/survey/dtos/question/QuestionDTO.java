package com.wora.survey.dtos.question;

import com.wora.survey.dtos.Subject.EmbeddedSubjectDTO;
import com.wora.survey.dtos.answer.EmbeddedAnswerDTO;
import com.wora.survey.entities.eums.QuestionType;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionDTO {
    private Integer id;
    private String text;
    private Integer answerCount;
    private QuestionType type;
    private EmbeddedSubjectDTO subject;
    private List<EmbeddedAnswerDTO> answers;
}

