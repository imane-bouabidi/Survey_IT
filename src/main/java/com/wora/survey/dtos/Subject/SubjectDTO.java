package com.wora.survey.dtos.Subject;

import java.util.List;

public class SubjectDTO {
    private Integer id;
    private String title;
    private List<EmbeddedQuestionDTO> questions;
    private EmbeddedSubjectDTO parentSubject;
    private List<EmbeddedSubjectDTO> subSubjects;
}

