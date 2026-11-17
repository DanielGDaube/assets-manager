package com.pluralsight;

import java.math.BigDecimal;

public class House extends  Assets{
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, BigDecimal originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public House setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getCondition() {
        return condition;
    }

    public House setCondition(int condition) {
        this.condition = condition;
        return this;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public House setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
        return this;
    }

    public int getLotSize() {
        return lotSize;
    }

    public House setLotSize(int lotSize) {
        this.lotSize = lotSize;
        return this;
    }
}
