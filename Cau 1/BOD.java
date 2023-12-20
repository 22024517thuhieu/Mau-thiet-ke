package org.example;

public class BOD {
    private int year;
    private int month;
    private int day;

    /**bb*/
    public BOD(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**bb*/
    public int getYear() {
        return year;
    }

    /**bb*/
    public void setYear(int year) {
        this.year = year;
    }

    /**bb*/
    public int getMonth() {
        return month;
    }

    /**bb*/
    public void setMonth(int month) {
        this.month = month;
    }

    /**bb*/
    public int getDay() {
        return day;
    }

    /**bb*/
    public void setDay(int day) {
        this.day = day;
    }

    /**bb*/
    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }
}
