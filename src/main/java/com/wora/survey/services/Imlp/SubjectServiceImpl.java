package com.wora.survey.services.Imlp;

import com.wora.survey.dtos.subject.SubjectCreateDTO;
import com.wora.survey.dtos.subject.SubjectDTO;
import com.wora.survey.dtos.subject.SubjectUpdateDTO;
import com.wora.survey.entities.Subject;
import com.wora.survey.mappers.SubjectMapper;
import com.wora.survey.repositories.SubjectRepository;
import com.wora.survey.services.Interfaces.SubjectService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SubjectServiceImpl implements SubjectService {

    private final SubjectRepository subjectRepository;
    private final SubjectMapper subjectMapper;

    public SubjectDTO save(SubjectCreateDTO subjectCreateDTO) {
        Subject subject = subjectMapper.toEntity(subjectCreateDTO);
        return subjectMapper.toDTO(subjectRepository.save(subject));
    }

    public List<SubjectDTO> findAll() {
        return subjectRepository.findAll()
                .stream()
                .map(subjectMapper::toDTO)
                .toList();
    }

    public SubjectDTO findById(Integer id) {
        Subject subject = subjectRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Subject not found"));
        return subjectMapper.toDTO(subject);
    }

    public SubjectDTO update(SubjectUpdateDTO subjectUpdateDTO) {
        Subject subject = subjectRepository.findById(subjectUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Subject not found"));

        subject.setTitle(subjectUpdateDTO.getTitle());

        if (subjectUpdateDTO.getParentSubjectId() != null) {
            Subject parentSubject = subjectRepository.findById(subjectUpdateDTO.getParentSubjectId())
                    .orElseThrow(() -> new EntityNotFoundException("Parent Subject not found"));
            subject.setParentSubject(parentSubject);
        }

        return subjectMapper.toDTO(subjectRepository.save(subject));
    }


    public void delete(Integer id) {
        if (!subjectRepository.existsById(id)) {
            throw new EntityNotFoundException("Subject not found");
        }
        subjectRepository.deleteById(id);
    }
}
