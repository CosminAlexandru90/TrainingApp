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
@Table(name = "t_microcycles")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Microcycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate startDate;
    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private MicrocycleType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mesocycle_id", nullable = false)
    @JsonBackReference("meso-micro")
    private Mesocycle mesocycle;

    @OneToMany(mappedBy = "microcycle", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference("micro-session")
    private List<TrainingSession> sessions;
}
