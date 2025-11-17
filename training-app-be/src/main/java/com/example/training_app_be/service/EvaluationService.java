package com.example.training_app_be.service;

import com.example.training_app_be.dto.EvaluationDto;
import com.example.training_app_be.model.Evaluation;
import com.example.training_app_be.repository.EvaluationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EvaluationService {

    private final EvaluationRepository evaluationRepository;

    public void addEvaluation(EvaluationDto evaluationDto){
        Evaluation evaluation = new Evaluation();
        evaluation.setType(evaluationDto.type());
        evaluation.setValue(evaluationDto.value());
        evaluation.setUnit(evaluationDto.unit());
        evaluation.setDate(evaluationDto.date());
        evaluationRepository.save(evaluation);
    }
}
