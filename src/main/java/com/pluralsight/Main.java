package com.pluralsight;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Assets> assetsList = new ArrayList<>();
        BigDecimal cost = new BigDecimal("3257.50");
        House smallHouse = new House("small", "1902",cost,"333 house street",3,300,3444);
        assetsList.add(smallHouse);
        House bigHouse = new House("big", "1800",cost,"324 house street",2,1500,5000);
        assetsList.add(bigHouse);
        Vehicle myCar = new Vehicle("car", "2007", cost, "Honda Accord", 2000,100001);
        assetsList.add(myCar);
        Vehicle myTruck = new Vehicle("truck", "2007", cost, "Ford Fusion", 2025,100004);
        assetsList.add(myTruck);

        for (Assets asset : assetsList){
            System.out.println(asset.getDescription());
            System.out.println(asset.getDateAcquired());
            System.out.println(asset.getOriginalCost());
            System.out.println(asset.getValue());
            if (asset instanceof House){
                System.out.println(((House) asset).getAddress());
            } else if (asset instanceof Vehicle) {
                System.out.println(((Vehicle) asset).getMakeModel());
            }
        }

    }
}
