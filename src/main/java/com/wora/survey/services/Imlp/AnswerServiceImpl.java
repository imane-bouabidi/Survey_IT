package com.wora.survey.services.Imlp;

import com.wora.survey.dtos.answer.AnswerCreateDTO;
import com.wora.survey.dtos.answer.AnswerDTO;
import com.wora.survey.dtos.answer.AnswerUpdateDTO;
import com.wora.survey.entities.Answer;
import com.wora.survey.mappers.AnswerMapper;
import com.wora.survey.repositories.AnswerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnswerServiceImpl {

    private AnswerRepository answerRepository;
    private AnswerMapper answerMapper;

    public AnswerDTO save(AnswerCreateDTO answerCreateDTO) {
        Answer answer = answerMapper.toEntity(answerCreateDTO);
        return answerMapper.toDTO(answerRepository.save(answer));
    }

    public List<AnswerDTO> getAllAnswers() {
        return answerRepository.findAll()
                .stream()
                .map(answerMapper::toDTO)
                .toList();
    }

    public AnswerDTO getAnswerById(Integer id) {
        Answer answer = answerRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Answer not found"));
        return answerMapper.toDTO(answer);
    }

    public AnswerDTO updateAnswer(AnswerUpdateDTO answerUpdateDTO) {
        Answer answer = answerRepository.findById(answerUpdateDTO.getId())
                .orElseThrow(() -> new EntityNotFoundException("Answer not found"));
        AnswerDTO answerDTO = answerMapper.toDTO(answer);

        answerDTO.setText(answerUpdateDTO.getText());
        answerDTO.setSelectionCount(answerUpdateDTO.getSelectionCount());
        return answerMapper.toDTO(answerRepository.save(answer));
    }

    public void deleteAnswer(Integer id) {
        if (!answerRepository.existsById(id)) {
            throw new EntityNotFoundException("Answer not found");
        }
        answerRepository.deleteById(id);
    }
}
