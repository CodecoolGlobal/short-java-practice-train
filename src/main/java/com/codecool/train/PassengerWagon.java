package com.codecool.train;

class PassengerWagon extends Wagon{
    static final int NUM_OF_PASSENGER_SEATS = 50;
    static final int CARGO_MASS_IN_TONS = 0;

    PassengerWagon() {
        super(CARGO_MASS_IN_TONS, NUM_OF_PASSENGER_SEATS);
    }
}
