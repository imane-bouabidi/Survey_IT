package com.wora.survey.dtos.survey;

import com.wora.survey.dtos.owner.EmbeddedOwnerDTO;
import com.wora.survey.dtos.surveyEdition.EmbeddedSurveyEditionDTO;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SurveyDTO {
    private Integer id;
    @NotNull
    @Size(min = 3, max = 50)
    private String title;
    private String description;
    private EmbeddedOwnerDTO owner;
    private List<EmbeddedSurveyEditionDTO> editions;

}
