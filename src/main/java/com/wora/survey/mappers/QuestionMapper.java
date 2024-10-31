package com.wora.survey.mappers;

import com.wora.survey.dtos.question.QuestionCreateDTO;
import com.wora.survey.dtos.question.QuestionDTO;
import com.wora.survey.dtos.question.QuestionUpdateDTO;
import com.wora.survey.entities.Question;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface QuestionMapper {
    QuestionDTO toDTO(Question question);
    Question toEntity(QuestionCreateDTO questionCreateDTO );
    Question toEntity(QuestionUpdateDTO questionUpdateDTO);
}