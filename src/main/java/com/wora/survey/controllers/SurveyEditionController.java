package com.wora.survey.controllers;

import com.wora.survey.dtos.surveyEdition.SurveyEditionCreateDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionDTO;
import com.wora.survey.dtos.surveyEdition.SurveyEditionUpdateDTO;
import com.wora.survey.services.Interfaces.SurveyEditionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveyEditions")
@RequiredArgsConstructor
public class SurveyEditionController {

    private final SurveyEditionService surveyEditionService;

    @PostMapping
    public ResponseEntity<SurveyEditionDTO> createSurveyEdition(@Validated @RequestBody SurveyEditionCreateDTO surveyEditionCreateDTO) {
        SurveyEditionDTO createdSurveyEdition = surveyEditionService.save(surveyEditionCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSurveyEdition);
    }

    @GetMapping
    public ResponseEntity<List<SurveyEditionDTO>> getAllSurveyEditions() {
        List<SurveyEditionDTO> surveyEditions = surveyEditionService.findAll();
        return new ResponseEntity<>(surveyEditions, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SurveyEditionDTO> getSurveyEditionById(@PathVariable Integer id) {
        SurveyEditionDTO surveyEdition = surveyEditionService.findById(id);
        return ResponseEntity.ok(surveyEdition);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SurveyEditionDTO> updateSurveyEdition(@PathVariable Integer id,@Validated @RequestBody SurveyEditionUpdateDTO surveyEditionUpdateDTO) {
        surveyEditionUpdateDTO.setId(id);
        SurveyEditionDTO updatedSurveyEdition = surveyEditionService.update(surveyEditionUpdateDTO);
        return ResponseEntity.ok(updatedSurveyEdition);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurveyEdition(@PathVariable Integer id) {
        surveyEditionService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
