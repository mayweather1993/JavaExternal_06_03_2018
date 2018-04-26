package com.homework.airport.controllers;

import com.homework.airport.EventCreator;
import com.homework.airport.SimpleEventCreator;
import com.homework.airport.domain.Airport;
import com.homework.airport.domain.Event;
import com.homework.airport.utils.SleepUtils;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.homework.airport.utils.SleepUtils.sleep;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

@Slf4j
public class AirportsController {


    private Map<String, Airport> airportsByName = new HashMap<>();
    private final EventCreator eventCreator;

    public AirportsController() {
        this(new SimpleEventCreator());
    }

    public AirportsController(final EventCreator eventCreator) {
        this.eventCreator = eventCreator;
    }

    public void register(final List<Airport> airports) {
        if (airports == null || airports.size() < 2) {
            throw new IllegalArgumentException("Airports should be 2 or more");
        }
        airportsByName = airports.stream()
                .collect(toMap(Airport::getName, identity()));
        eventCreator.registerAirports(airports);
        log.info("Registered [{}] airports", airports.size());
    }

    public void start() {
        final int airportsCount = airportsByName.size();
        if (airportsCount < 2) {
            log.warn("No airports were found to start. Stopping...");
            return;
        }

        while (true) {
            final Event event = eventCreator.getEvent();
            final Airport fromAirport = airportsByName.get(event.getFrom());
            final Airport toAirport = airportsByName.get(event.getTo());

            fromAirport.consume(event);
            toAirport.consume(event);
            sleep(100);
        }
    }
}
