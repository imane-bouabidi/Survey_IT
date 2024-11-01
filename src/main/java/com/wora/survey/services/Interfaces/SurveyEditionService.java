package com.wora.survey.services.Interfaces;

import com.wora.survey.dtos.surveyEdition.SurveyEditionCreateDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionUpdateDTO;
import com.wora.survey.services.GenericService;

public interface SurveyEditionService extends GenericService<SurveyEditionCreateDTO, SurveyEditionUpdateDTO, SurveyEditionDTO, Integer> {
}

