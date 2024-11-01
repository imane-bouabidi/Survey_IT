package com.wora.survey.dtos.surveyEdition;

import com.wora.survey.dtos.subject.EmbeddedSubjectDTO;
import com.wora.survey.dtos.survey.EmbeddedSurveyDTO;

import java.time.LocalDate;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SurveyEditionDTO {
    private Integer id;
    private LocalDate creationDate;
    private LocalDate startDate;
    private Integer year;
    private EmbeddedSurveyDTO survey;
    private List<EmbeddedSubjectDTO> subjects;

}
