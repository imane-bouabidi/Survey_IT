package com.wora.survey.dtos.survey;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SurveyCreationDTO {
    private String title;
    private String description;
    private Integer ownerId;

}
