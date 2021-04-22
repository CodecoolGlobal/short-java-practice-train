package com.codecool.train;

class CargoWagon extends Wagon{
    static final int NUM_OF_PASSENGER_SEATS = 0;
    static final int CARGO_MASS_IN_TONS = 30;

    CargoWagon() {
        super(CARGO_MASS_IN_TONS, NUM_OF_PASSENGER_SEATS);
    }
}
