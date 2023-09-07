package com.nhnacademy.java.poker;

public class Date {
    private int year;
    private int month;
    private int day;
    private DaysWeek daysInWeek;

    public Date(int year, int month, int day, DaysWeek daysInWeek) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.daysInWeek = daysInWeek;
    }

    public int getYear() {
        return this.year;
    }

    public Date() {
        this(1971, 4, 28, DaysWeek.THU);
    }

    public String toString() {
        return this.year + "-" + this.month + "-" + this.day + "-" + this.daysInWeek;
    }
}
