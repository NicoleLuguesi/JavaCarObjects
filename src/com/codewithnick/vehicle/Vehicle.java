package com.codewithnick.vehicle;

public class Vehicle {
    String color;
    int year;
    int doors;
    int tires;

    /**
     * Default Constructor sets variables from null to default values
     */
    public Vehicle() {
        this.color = "color";
        this.year = 2010;
        this.doors = 4;
        this.tires = 4;
    }

    /**
     * set all variables
     * @param color
     * @param year
     * @param doors
     * @param tires
     */
    public Vehicle(String color, int year, int doors, int tires) {
        this.color = color;
        this.year = year;
        this.doors = doors;
        this.tires = tires;
    }

    /**
     * sets color of vehicle
     * @param newColor new color of vehicle
     */
    public void setColor(String newColor){
        this.color = newColor;
    }

    public String getColor(){
        return this.color;
    }
}
