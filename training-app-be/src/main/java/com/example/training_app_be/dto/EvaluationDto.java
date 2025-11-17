package com.example.training_app_be.dto;

import com.example.training_app_be.model.EvaluationType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record EvaluationDto(Long id, EvaluationType type, BigDecimal value, String unit, LocalDate date) {
}
