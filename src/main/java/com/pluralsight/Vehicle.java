package com.pluralsight;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

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

    @Override
    public BigDecimal getValue(){
        BigDecimal value = new BigDecimal("0.00");
        value = value.add(getOriginalCost());
        int age = LocalDate.now().getYear() - year;
        if (age > 10){
            value = new BigDecimal("1000.00");
        } else if (age >= 7) {
            BigDecimal discount = value.multiply(new BigDecimal("0.08"));
            discount = discount.multiply(BigDecimal.valueOf(age));
            value = value.subtract(discount);
        } else if (age >=4) {
            BigDecimal discount = value.multiply(new BigDecimal("0.06"));
            discount = discount.multiply(BigDecimal.valueOf(age));
            value = value.subtract(discount);
        }
        else{
            BigDecimal discount = value.multiply(new BigDecimal("0.03"));
            discount = discount.multiply(BigDecimal.valueOf(age));
            value = value.subtract(discount);
        }

        if (odometer > 100000 && !makeModel.contains("Honda") && !makeModel.contains("Toyota")){
            BigDecimal discount = value.multiply(new BigDecimal("0.25"));
            value = value.subtract(discount);
        }

        value = value.setScale(2, RoundingMode.HALF_UP);
        return  value;
    }
}
