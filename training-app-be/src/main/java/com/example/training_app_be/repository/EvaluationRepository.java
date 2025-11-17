package com.example.training_app_be.repository;

import com.example.training_app_be.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository  extends JpaRepository<Evaluation, Long> {
}
