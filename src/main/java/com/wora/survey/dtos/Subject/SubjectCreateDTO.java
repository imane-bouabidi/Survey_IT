package com.wora.survey.dtos.Subject;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectCreateDTO {
    @NotBlank
    private String title;
    private Integer parentSubjectId;
}
