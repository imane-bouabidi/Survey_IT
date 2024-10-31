package com.wora.survey.dtos.surveyEdition;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmbeddedSurveyEditionDTO {
    private Integer id;
    private LocalDate creationDate;
    private LocalDate startDate;
    private Integer year;
}
