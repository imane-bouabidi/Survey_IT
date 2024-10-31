package com.wora.survey.mappers;

import com.wora.survey.dtos.survey.SurveyCreationDTO;
import com.wora.survey.dtos.survey.SurveyDTO;
import com.wora.survey.dtos.survey.SurveyUpdateDTO;
import com.wora.survey.entities.Survey;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurveyMapper {
    SurveyDTO toDTO(Survey survey);
    Survey toEntity(SurveyCreationDTO surveyCreationDTO );
    Survey toEntity(SurveyUpdateDTO surveyUpdateDTO);
}
