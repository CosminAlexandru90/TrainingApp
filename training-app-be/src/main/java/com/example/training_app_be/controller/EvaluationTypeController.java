package com.example.training_app_be.controller;

import com.example.training_app_be.model.EvaluationType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/evaluation-types")
public class EvaluationTypeController {
    @GetMapping
    public List<String> getAllEvaluationTypes() {
        return Arrays.stream(EvaluationType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
    }
}