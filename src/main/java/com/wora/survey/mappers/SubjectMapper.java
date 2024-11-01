package com.wora.survey.mappers;

import com.wora.survey.dtos.subject.SubjectCreateDTO;
import com.wora.survey.dtos.subject.SubjectDTO;
import com.wora.survey.dtos.subject.SubjectUpdateDTO;
import com.wora.survey.entities.Subject;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubjectMapper {
    SubjectDTO toDTO(Subject subject);
    Subject toEntity(SubjectCreateDTO subjectCreateDTO );
    Subject toEntity(SubjectUpdateDTO subjectUpdateDTO);
}