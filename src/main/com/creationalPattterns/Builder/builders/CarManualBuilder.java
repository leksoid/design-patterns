package com.creationalPattterns.Builder.builders;

import com.creationalPattterns.Builder.cars.Manual;
import com.creationalPattterns.Builder.cars.Type;
import com.creationalPattterns.Builder.components.Engine;
import com.creationalPattterns.Builder.components.GPSNavigator;
import com.creationalPattterns.Builder.components.Transmission;
import com.creationalPattterns.Builder.components.TripComputer;

public class CarManualBuilder implements Builder {
    private Type type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    public Manual getResult() {
        return new Manual();
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