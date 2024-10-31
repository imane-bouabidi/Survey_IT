package com.wora.survey.dtos.Subject;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SubjectUpdateDTO {
    private Integer id;
    @NotBlank
    private String title;
    private Integer parentSubjectId;
}

