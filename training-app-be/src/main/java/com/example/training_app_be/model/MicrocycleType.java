package com.example.training_app_be.model;

import lombok.Getter;

@Getter
public enum MicrocycleType {
    BASE("Base week"),
    PROGRESS("Progress week"),
    PEAK("Peak week"),
    DELOAD("Deload week"),
    RECOVERY("Recovery week");


    private final String displayName;

    MicrocycleType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
