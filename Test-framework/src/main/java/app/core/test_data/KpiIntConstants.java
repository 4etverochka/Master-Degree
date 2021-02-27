package app.core.test_data;

import lombok.Getter;

public enum KpiIntConstants {

    NUMBER_ZERO(0),
    NUMBER_ONE(1),
    NUMBER_TWO(2),
    NUMBER_THREE(3),
    NUMBER_FOUR(4),
    NUMBER_SIX(6),
    NUMBER_EIGHT(8),
    COUNT_OF_TEACHERS_ENG(20),
    COUNT_OF_TEACHERS(41),
    TEACHER_FROM_LIST_NUMBER(18);

    @Getter
    private final int value;

    KpiIntConstants(final int newValue) {
        value = newValue;
    }
}