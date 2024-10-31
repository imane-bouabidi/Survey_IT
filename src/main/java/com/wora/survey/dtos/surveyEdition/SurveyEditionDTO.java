package com.wora.survey.dtos.surveyEdition;

import com.wora.survey.dtos.Subject.EmbeddedSubjectDTO;
import com.wora.survey.dtos.survey.EmbeddedSurveyDTO;
import com.wora.survey.entities.Survey;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.util.List;

public class SurveyEditionDTO {
    private Integer id;
    private LocalDate creationDate;
    private LocalDate startDate;
    private Integer year;
    private EmbeddedSurveyDTO survey;
    private List<EmbeddedSubjectDTO> subjects;

}
