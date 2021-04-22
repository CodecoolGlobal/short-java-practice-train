package com.codecool.train;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private List<Wagon> wagons = new ArrayList<>();

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public Train(int numOfPassengers, int cargoInTons) {
        for (int i=0; i < Math.ceil(numOfPassengers / (double) PassengerWagon.NUM_OF_PASSENGER_SEATS); i++){
            wagons.add(new PassengerWagon());
        }
        for (int i=0; i < Math.ceil(cargoInTons / (double) CargoWagon.CARGO_MASS_IN_TONS); i++){
            wagons.add(new CargoWagon());
        }
    }

    public List<Wagon> getWagons() {
        return wagons;
    }

    public int getNumOfWagons(){
        return wagons.size();
    }

    public int getPassengerCapacity(){
        return wagons.stream().mapToInt(Wagon::getNumberOfPassengerSeats).sum();
    }

    public int getCargoCapacity(){
        return wagons.stream().mapToInt(Wagon::getCargoMass).sum();
    }
}
