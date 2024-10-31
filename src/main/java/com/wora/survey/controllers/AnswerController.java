package com.wora.survey.controllers;

import com.wora.survey.dtos.answer.AnswerCreateDTO;
import com.wora.survey.dtos.answer.AnswerDTO;
import com.wora.survey.dtos.answer.AnswerUpdateDTO;
import com.wora.survey.services.Imlp.AnswerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/answers")
public class AnswerController {

    @Autowired
    private AnswerServiceImpl answerService;

    @PostMapping
    public ResponseEntity<AnswerDTO> createAnswer(@Validated @RequestBody AnswerCreateDTO answerCreateDTO) {
        AnswerDTO createdAnswer = answerService.save(answerCreateDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAnswer);
    }

    @GetMapping
    public ResponseEntity<List<AnswerDTO>> getAllAnswers() {
        List<AnswerDTO> answers = answerService.findAll();
        return ResponseEntity.ok(answers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnswerDTO> getAnswerById(@PathVariable Integer id) {
        AnswerDTO answer = answerService.findById(id);
        return ResponseEntity.ok(answer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AnswerDTO> updateAnswer(@PathVariable Integer id,@Validated @RequestBody AnswerUpdateDTO answerUpdateDTO) {
        answerUpdateDTO.setId(id);
        AnswerDTO updatedAnswer = answerService.update(answerUpdateDTO);
        return ResponseEntity.ok(updatedAnswer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnswer(@PathVariable Integer id) {
        answerService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
