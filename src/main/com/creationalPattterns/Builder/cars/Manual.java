package com.creationalPattterns.Builder.cars;

import com.creationalPattterns.Builder.components.Engine;
import com.creationalPattterns.Builder.components.GPSNavigator;
import com.creationalPattterns.Builder.components.Transmission;
import com.creationalPattterns.Builder.components.TripComputer;

public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
               TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        //info += "Engine: volume - " + engine.getVolume() + "; mileage - "
        return null;
    }
}