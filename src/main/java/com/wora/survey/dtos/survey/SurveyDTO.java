package com.wora.survey.dtos.survey;

import com.wora.survey.dtos.owner.EmbeddedOwnerDTO;
import com.wora.survey.dtos.surveyEdition.EmbeddedSurveyEditionDTO;

import java.util.List;

public class SurveyDTO {
    private Integer id;
    private String title;
    private String description;
    private EmbeddedOwnerDTO owner;
    private List<EmbeddedSurveyEditionDTO> editions;

}
