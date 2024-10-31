package com.wora.survey.services.Interfaces;

import com.wora.survey.dtos.answer.AnswerCreateDTO;
import com.wora.survey.dtos.answer.AnswerDTO;
import com.wora.survey.dtos.answer.AnswerUpdateDTO;
import com.wora.survey.services.GenericService;

public interface AnswerService extends GenericService<AnswerCreateDTO, AnswerUpdateDTO, AnswerDTO, Integer> {
}
