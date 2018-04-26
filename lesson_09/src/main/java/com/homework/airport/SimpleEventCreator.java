package com.homework.airport;


import com.homework.airport.domain.Airport;
import com.homework.airport.domain.Event;
import com.homework.airport.domain.Plane;
import com.homework.airport.utils.RandomUtil;

import java.util.List;

public class SimpleEventCreator implements EventCreator {

    private List<Airport> airports;
    private int airportsCount;

    @Override
    public Event getEvent() {
        final int from = RandomUtil.nextInt(airportsCount);
        final int to = getDestinationAirportIndex(from);
        final String fromName = airports.get(from).getName();
        final String toName = airports.get(to).getName();
        final int seats = RandomUtil.nextInt(300) + 1;
        final int priority = RandomUtil.nextInt(10);
        final Plane plane = new Plane(seats, "Airbus");
        return new Event(fromName, toName, plane, priority);
    }

    private int getDestinationAirportIndex(int from) {
        int to;
        do {
            to = RandomUtil.nextInt(airportsCount);
        } while (from == to);
        return to;
    }

    @Override
    public void registerAirports(final List<Airport> airports) {
        this.airports = airports;
        this.airportsCount = airports.size();
    }
}
