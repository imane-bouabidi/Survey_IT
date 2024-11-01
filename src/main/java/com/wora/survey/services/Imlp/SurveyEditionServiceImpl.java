package com.wora.survey.services.Imlp;

import com.wora.survey.dtos.surveyEdition.SurveyEditionCreateDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionUpdateDTO;
import com.wora.survey.entities.SurveyEdition;
import com.wora.survey.mappers.SurveyEditionMapper;
import com.wora.survey.repositories.SurveyEditionRepository;
import com.wora.survey.services.Interfaces.SurveyEditionService;
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SurveyEditionServiceImpl implements SurveyEditionService {
    private final SurveyEditionRepository surveyEditionRepository;
    private final SurveyEditionMapper surveyEditionMapper;

    public SurveyEditionDTO save(@RequestBody @Valid SurveyEditionCreateDTO surveyCreationDTO) {
        SurveyEdition surveyEdition = surveyEditionMapper.toEntity(surveyCreationDTO);
        return surveyEditionMapper.toDTO(surveyEditionRepository.save(surveyEdition));
    }

    public List<SurveyEditionDTO> findAll() {
        return surveyEditionRepository.findAll()
                .stream()
                .map(surveyEditionMapper::toDTO)
                .toList();
    }

    public SurveyEditionDTO findById(Integer id) {
        SurveyEdition surveyEdition = surveyEditionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Survey Edition not found"));
        return surveyEditionMapper.toDTO(surveyEdition);
    }

    public SurveyEditionDTO update(SurveyEditionUpdateDTO surveyUpdateDTO) {
        SurveyEdition surveyEdition = surveyEditionRepository.findById(surveyUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Survey Edition not found"));

        surveyEdition.setStartDate(surveyUpdateDTO.getStartDate());
        surveyEdition.setYear(surveyUpdateDTO.getYear());
        return surveyEditionMapper.toDTO(surveyEditionRepository.save(surveyEdition));
    }

    public void delete(Integer id) {
        if (!surveyEditionRepository.existsById(id)) {
            throw new EntityNotFoundException("Survey Edition not found");
        }
        surveyEditionRepository.deleteById(id);
    }
}
