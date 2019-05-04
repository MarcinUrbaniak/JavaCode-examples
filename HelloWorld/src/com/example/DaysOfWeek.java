package com.example;

/**
 * w enumie zmienne są final, taka jest konwencja
 */

public enum DaysOfWeek {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final  int dayNo;


    DaysOfWeek(int dayNo) {
        this.dayNo = dayNo;
    }

    public int getDayNo() {
        return dayNo;
    }

}
