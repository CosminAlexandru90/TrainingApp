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
@Table(name = "t_trainig_sessions")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TrainingSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    private String objectives;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "microcycle_id", nullable = false)
    @JsonBackReference("micro-session")
    private Microcycle microcycle;

    @OneToMany(mappedBy = "training_session", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("session-exercise")
    private List<Exercise> exercises;
}
