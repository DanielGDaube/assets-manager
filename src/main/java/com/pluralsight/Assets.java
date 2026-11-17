package com.pluralsight;

import java.math.BigDecimal;

public class Assets {
    private String description;
    private String dateAcquired;
    private BigDecimal originalCost;

    public Assets(String description, String dateAcquired, BigDecimal originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }

    public Assets setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public Assets setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
        return this;
    }

    public BigDecimal getOriginalCost() {
        return originalCost;
    }

    public Assets setOriginalCost(BigDecimal originalCost) {
        this.originalCost = originalCost;
        return this;
    }

    public BigDecimal getValue(){
        return originalCost;
    }
}

