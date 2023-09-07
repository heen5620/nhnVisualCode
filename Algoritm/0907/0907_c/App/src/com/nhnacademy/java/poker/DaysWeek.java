package com.nhnacademy.java.poker;

public enum DaysWeek {
    MON("Monday"), TUE("Tuesday"), WED("Wendsday"), THU("Thusday"), FRI("Friday"), SAT("Saturday"), SUN("Sunday");

    public String dayName;

    DaysWeek(String dayName) {
        this.dayName = dayName;
    }

    public String toString() {
        return this.dayName;
    }

}
