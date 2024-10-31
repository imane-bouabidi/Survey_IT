package com.wora.survey.dtos.Subject;

import jakarta.validation.constraints.NotBlank;


public class SubjectUpdateDTO {
    @NotBlank
    private String title;
    private Integer parentSubjectId;
}

