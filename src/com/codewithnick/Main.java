package com.codewithnick;

import com.codewithnick.vehicle.Sedan;
import com.codewithnick.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {

        Vehicle myVehicle = new Vehicle("blue", 2020, 4, 4);
       // myVehicle.setColor("black");
        System.out.println(myVehicle.getColor());

       // Sedan mySedan = new Sedan();

        //System.out.println(mySedan.getColor());



    }
}
