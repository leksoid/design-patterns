package com.creationalPattterns.Builder.builders;

import com.creationalPattterns.Builder.cars.Type;
import com.creationalPattterns.Builder.components.*;

/**
 * Specifies interface for creating parts of a Product object
 */
public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}