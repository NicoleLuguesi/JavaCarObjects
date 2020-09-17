package com.codewithnick.vehicle;

public class Sedan extends Vehicle {
     byte seats;

    public Sedan() {
        super();
        this.seats = 5;
    }

    public Sedan(String color, int year, int tires, byte seats) {
        super(color, year, 4, tires);
        this.seats = seats;
    }

    public byte getSeats() {
        return seats;
    }

    public void setSeats(byte seats) {
        this.seats = seats;
    }
}
