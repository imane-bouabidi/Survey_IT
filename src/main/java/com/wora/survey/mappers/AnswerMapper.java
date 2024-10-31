package com.wora.survey.mappers;

import com.wora.survey.dtos.answer.AnswerCreateDTO;
import com.wora.survey.dtos.answer.AnswerDTO;
import com.wora.survey.dtos.answer.AnswerUpdateDTO;
import com.wora.survey.entities.Answer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AnswerMapper {

    AnswerDTO toDTO(Answer answer);
    Answer toEntity(AnswerCreateDTO answerCreateDTO);
    Answer toEntity(AnswerUpdateDTO answerUpdateDTO);

}
