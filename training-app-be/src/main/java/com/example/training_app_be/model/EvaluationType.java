package com.example.training_app_be.model;

import lombok.Getter;

@Getter
public enum EvaluationType {
    // SPRINT AND SPEED
    THIRTY_FLY("30m fly"),
    THIRTY_START("30m start"),
    SIXTY_METER("60m"),
    ONE_HUNDRED_METER("100m"),
    TWO_HUNDRED_METER("200m"),
    THREE_HUNDRED_METER("300m"),
    FOUR_HUNDRED_METER("400m"),
    FIFTEEN_HUNDRED_METER("1500m"),

    // JUMPS AND POWER
    BROAD_JUMP("Standing Broad Jump"),
    VERTICAL_JUMP("Vertical Jump (Max Reach)"),
    THREE_BOUNDS("3 bounds"),
    FIVE_BOUNDS("5 bounds"),
    HIGH_JUMP_TRAINING("High Jump (Training)"),
    LONG_JUMP_TRAINING("Long Jump (Training)"),
    TRIPLE_JUMP_TRAINING("Triple Jump (Training)"),
    HIGH_JUMP_COMPETITION("High Jump (Comp)"),
    LONG_JUMP_COMPETITION("Long Jump (Comp)"),
    TRIPLE_JUMP_COMPETITION("Triple Jump (Comp)"),

    // STRENGTH
    BACK_SQUAT("Back squat"),
    HALF_BACK_SQUAT("Half back squat"),
    QUARTER_BACK_SQUAT("Quarter back squat"),
    BULGARIAN_SPLIT_SQUAT("Quarter back squat"),
    HANG_CLEAN("Hang clean"),
    ROMANIAN_DEADLIFT("Romanian deadlift"),
    SINGLE_LEG_RDL("Single leg RDL"),

    // THROWS (for multi-event athletes or specific event training)
    MEDICINE_BALL_THROW_BACKWARD("Med Ball Throw (Backward)"),
    SHOT_PUT_COMPETITION("Shot Put (Comp)"),
    JAVELIN_COMPETITION("Javelin (Comp)"),
    DISCUS_COMPETITION("Discus (Comp)"),
    SHOT_PUT_TRAINING("Shot Put (Comp)"),
    JAVELIN_TRAINING("Javelin (Comp)"),
    DISCUS_TRAINING("Discus (Comp)");

    private final String displayName;

    EvaluationType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}