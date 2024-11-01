package com.wora.survey.dtos.subject;

import com.wora.survey.dtos.question.EmbeddedQuestionDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectDTO {
    private Integer id;
    @NotNull
    @Size(min = 3, max = 50)
    private String title;
    private List<EmbeddedQuestionDTO> questions;
    private EmbeddedSubjectDTO parentSubject;
    private List<EmbeddedSubjectDTO> subSubjects;
}

