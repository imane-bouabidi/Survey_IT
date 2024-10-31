package com.wora.survey.services.Imlp;

import com.wora.survey.dtos.survey.SurveyCreationDTO;
import com.wora.survey.dtos.survey.SurveyDTO;
import com.wora.survey.dtos.survey.SurveyUpdateDTO;
import com.wora.survey.entities.Survey;
import com.wora.survey.mappers.SurveyMapper;
import com.wora.survey.repositories.SurveyRepository;
import com.wora.survey.services.Interfaces.SurveyService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyServiceImpl implements SurveyService {

    private final SurveyRepository surveyRepository;
    private final SurveyMapper surveyMapper;

    public SurveyDTO save(SurveyCreationDTO surveyCreationDTO) {
        Survey survey = surveyMapper.toEntity(surveyCreationDTO);
        return surveyMapper.toDTO(surveyRepository.save(survey));
    }

    public List<SurveyDTO> findAll() {
        return surveyRepository.findAll()
                .stream()
                .map(surveyMapper::toDTO)
                .toList();
    }

    public SurveyDTO findById(Integer id) {
        Survey survey = surveyRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Survey not found"));
        return surveyMapper.toDTO(survey);
    }

    public SurveyDTO update(SurveyUpdateDTO surveyUpdateDTO) {
        Survey survey = surveyRepository.findById(surveyUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Survey not found"));

        survey.setTitle(surveyUpdateDTO.getTitle());
        survey.setDescription(surveyUpdateDTO.getDescription());
        return surveyMapper.toDTO(surveyRepository.save(survey));
    }

    public void delete(Integer id) {
        if (!surveyRepository.existsById(id)) {
            throw new EntityNotFoundException("Survey not found");
        }
        surveyRepository.deleteById(id);
    }
}
