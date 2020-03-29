package com.creationalPattterns.Builder.builders;

import com.creationalPattterns.Builder.cars.Car;
import com.creationalPattterns.Builder.cars.Type;
import com.creationalPattterns.Builder.components.Engine;
import com.creationalPattterns.Builder.components.GPSNavigator;
import com.creationalPattterns.Builder.components.Transmission;
import com.creationalPattterns.Builder.components.TripComputer;


/**
 * Concrete Builder - constructs and assembles parts of the product by implementing
 * the interface.
 * Defines and keeps track of the representation it creates
 * provides interface to retrieve the product
 */
public class CarBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }
}