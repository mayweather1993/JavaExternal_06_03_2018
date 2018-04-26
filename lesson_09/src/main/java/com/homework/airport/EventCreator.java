package com.homework.airport;


import com.homework.airport.domain.Airport;
import com.homework.airport.domain.Event;

import java.util.List;

public interface EventCreator {
    Event getEvent();

    void registerAirports(final List<Airport> airports);
}
