package com.wora.survey.mappers;

import com.wora.survey.dtos.surveyEdition.SurveyEditionCreateDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionUpdateDTO;
import com.wora.survey.entities.SurveyEdition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SurveyEditionMapper {
    SurveyEditionDTO toDTO(SurveyEdition subject);
    SurveyEdition toEntity(SurveyEditionCreateDTO surveyEditionCreateDTO );
    SurveyEdition toEntity(SurveyEditionUpdateDTO surveyEditionUpdateDTO);
}
