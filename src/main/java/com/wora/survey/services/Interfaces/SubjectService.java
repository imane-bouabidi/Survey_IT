package com.wora.survey.services.Interfaces;

import com.wora.survey.dtos.subject.SubjectCreateDTO;
import com.wora.survey.dtos.subject.SubjectDTO;
import com.wora.survey.dtos.subject.SubjectUpdateDTO;
import com.wora.survey.services.GenericService;

public interface SubjectService extends GenericService<SubjectCreateDTO, SubjectUpdateDTO, SubjectDTO, Integer> {
}
