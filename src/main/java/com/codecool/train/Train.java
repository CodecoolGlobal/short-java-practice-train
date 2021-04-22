package com.codecool.train;

import java.util.ArrayList;
import java.util.List;

class Train {
    private List<Wagon> wagons;

    Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    Train(int numOfPassengers, int cargoInTons) {
        wagons = new ArrayList<>();
        for (int i=0; i < Math.ceil(numOfPassengers / (double) PassengerWagon.NUM_OF_PASSENGER_SEATS); i++){
            wagons.add(new PassengerWagon());
        }
        for (int i=0; i < Math.ceil(cargoInTons / (double) CargoWagon.CARGO_MASS_IN_TONS); i++){
            wagons.add(new CargoWagon());
        }
    }

    List<Wagon> getWagons() {
        return wagons;
    }

    int getNumOfWagons(){
        return wagons.size();
    }

    int getPassengerCapacity(){
        return wagons.stream().mapToInt(Wagon::getNumberOfPassengerSeats).sum();
    }

    int getCargoCapacity(){
        return wagons.stream().mapToInt(Wagon::getCargoMass).sum();
    }
}
