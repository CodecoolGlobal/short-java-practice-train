package com.codecool.train;

abstract class Wagon {
    private int cargoMassInTons;
    private int numberOfPassengerSeats;

    Wagon(int cargoMassInTons, int numberOfPassengerSeats) {
        this.cargoMassInTons = cargoMassInTons;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    int getCargoMass() {
        return cargoMassInTons;
    }

    int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }
}
