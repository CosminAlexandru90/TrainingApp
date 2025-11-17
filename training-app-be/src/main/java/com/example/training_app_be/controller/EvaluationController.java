package com.example.training_app_be.controller;

import com.example.training_app_be.dto.EvaluationDto;
import com.example.training_app_be.service.EvaluationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/evaluation")
@RequiredArgsConstructor
public class EvaluationController {
    private final EvaluationService evaluationService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String addEvaluation(@RequestBody EvaluationDto evaluationDto) {
        evaluationService.addEvaluation(evaluationDto);
        return "Evaluation added successfully";
    }
}
