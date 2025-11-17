package com.example.training_app_be.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "t_mesocycles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Mesocycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // e.g., "General Preparation", "Strength Block 1"
    private LocalDate startDate;
    private LocalDate endDate;
    private String objectives;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "macrocycle_id", nullable = false)
    @JsonBackReference("macro-meso")
    private Macrocycle macrocycle;

    @OneToMany(mappedBy = "mesocycle", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("meso-micro")
    private List<Microcycle> microcycles;
}
