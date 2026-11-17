package com.pluralsight;

import java.math.BigDecimal;

public class Vehicle extends Assets{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, BigDecimal originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public Vehicle setMakeModel(String makeModel) {
        this.makeModel = makeModel;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Vehicle setYear(int year) {
        this.year = year;
        return this;
    }

    public int getOdometer() {
        return odometer;
    }

    public Vehicle setOdometer(int odometer) {
        this.odometer = odometer;
        return this;
    }
}
