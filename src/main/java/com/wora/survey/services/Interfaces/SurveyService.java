package com.wora.survey.services.Interfaces;

import com.wora.survey.dtos.survey.SurveyCreationDTO;
import com.wora.survey.dtos.survey.SurveyDTO;
import com.wora.survey.dtos.survey.SurveyUpdateDTO;
import com.wora.survey.services.GenericService;

public interface SurveyService extends GenericService<SurveyCreationDTO, SurveyUpdateDTO, SurveyDTO, Integer> {
}
