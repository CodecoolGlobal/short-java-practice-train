package com.codecool.train;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TrainTest {

    @Test
    void test_getWagons() {
        List<Wagon> expectedWagons = new ArrayList<>(){{
            add(new PassengerWagon());
            add(new CargoWagon());
        }};
        Train train = new Train(expectedWagons);
        Assertions.assertEquals(expectedWagons,train.getWagons());
    }

    @Test
    void test_getNumOfWagons() {
        List<Wagon> wagons = new ArrayList<>(){{
            add(new PassengerWagon());
            add(new PassengerWagon());
            add(new CargoWagon());
        }};
        Train train = new Train(wagons);
        Assertions.assertEquals(3,train.getNumOfWagons());
    }

    @Test
    void test_getPassengerCapacity() {
        List<Wagon> wagons = new ArrayList<>(){{
            add(new PassengerWagon());
            add(new PassengerWagon());
            add(new CargoWagon());
        }};
        Train train = new Train(wagons);
        Assertions.assertEquals(100,train.getPassengerCapacity());
    }

    @Test
    void test_getCargoCapacity() {
        List<Wagon> wagons = new ArrayList<>(){{
            add(new PassengerWagon());
            add(new CargoWagon());
            add(new CargoWagon());
        }};
        Train train = new Train(wagons);
        Assertions.assertEquals(60,train.getCargoCapacity());
    }

    @Test
    void test_train_constructor() {
        Train train = new Train(149,89);
        List<Wagon> wagons = train.getWagons();
        int cargoWagonNum = 0;
        int passangerWagonNum = 0;
        for (Wagon wagon : wagons) {
            if(wagon instanceof CargoWagon){
                cargoWagonNum++;
            }
            if(wagon instanceof PassengerWagon){
                passangerWagonNum++;
            }
        }
        Assertions.assertEquals(3,passangerWagonNum);
        Assertions.assertEquals(3,cargoWagonNum);
    }

    @Test
    void test_passengerWagon(){
        Wagon passengerWagon = new PassengerWagon();
        assertEquals(50,passengerWagon.getNumberOfPassengerSeats());
        assertEquals(0,passengerWagon.getCargoMass());
    }

    @Test
    void test_cargoWagon(){
        Wagon cargoWagon = new CargoWagon();
        assertEquals(0,cargoWagon.getNumberOfPassengerSeats());
        assertEquals(30,cargoWagon.getCargoMass());
    }
}