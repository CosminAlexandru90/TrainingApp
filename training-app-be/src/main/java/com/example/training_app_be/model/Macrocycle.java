package com.example.training_app_be.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "t_macrocycles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Macrocycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name; // e.g., "2026 Competition Year"
    private LocalDate startDate;
    private LocalDate endDate;
    private String objectives;

    @OneToMany(mappedBy = "macrocycle", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("macro-meso")
    private List<Mesocycle> mesocycles;
}
