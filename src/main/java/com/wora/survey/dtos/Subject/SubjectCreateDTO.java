package com.wora.survey.dtos.Subject;

import jakarta.validation.constraints.NotBlank;

public class SubjectCreateDTO {
    @NotBlank
    private String title;
    private Integer parentSubjectId;
}
