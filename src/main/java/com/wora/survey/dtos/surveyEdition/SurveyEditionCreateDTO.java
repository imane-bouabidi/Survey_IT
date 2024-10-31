package com.wora.survey.dtos.surveyEdition;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SurveyEditionCreateDTO {
    private LocalDate startDate;
    private Integer year;
    private Integer surveyId;
}
