package com.wora.survey.mappers;

import com.wora.survey.dtos.Subject.SubjectCreateDTO;
import com.wora.survey.dtos.Subject.SubjectDTO;
import com.wora.survey.dtos.Subject.SubjectUpdateDTO;
import com.wora.survey.entities.Subject;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectDTO toDTO(Subject subject);
    Subject toEntity(SubjectCreateDTO subjectCreateDTO );
    Subject toEntity(SubjectUpdateDTO subjectUpdateDTO);
}