package com.wora.survey.controllers;

import com.wora.survey.dtos.survey.SurveyCreationDTO;
import com.wora.survey.dtos.survey.SurveyDTO;
import com.wora.survey.dtos.survey.SurveyUpdateDTO;
import com.wora.survey.services.Interfaces.SurveyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/surveys")
@RequiredArgsConstructor
public class SurveyController {

    private final SurveyService surveyService;

    @PostMapping
    public ResponseEntity<SurveyDTO> createSurvey(@Validated @RequestBody SurveyCreationDTO surveyCreateDTO) {
        SurveyDTO createdSurvey = surveyService.save(surveyCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdSurvey);
    }

    @GetMapping
    public ResponseEntity<List<SurveyDTO>> getAllSurveys() {
        List<SurveyDTO> surveys = surveyService.findAll();
        return new ResponseEntity<>(surveys, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SurveyDTO> getSurveyById(@PathVariable Integer id) {
        SurveyDTO survey = surveyService.findById(id);
        return ResponseEntity.ok(survey);
    }

    @PutMapping("/{id}")
    public ResponseEntity<SurveyDTO> updateSurvey(@PathVariable Integer id,@Validated @RequestBody SurveyUpdateDTO surveyUpdateDTO) {
        surveyUpdateDTO.setId(id);
        SurveyDTO updatedSurvey = surveyService.update(surveyUpdateDTO);
        return ResponseEntity.ok(updatedSurvey);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSurvey(@PathVariable Integer id) {
        surveyService.delete(id);
        return ResponseEntity.noContent().build();
    }
}


