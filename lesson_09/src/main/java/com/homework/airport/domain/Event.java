package com.homework.airport.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Event implements Comparable<Event> {

    private final String from;
    private final String to;
    private final Plane plane;
    private final int priority;

    @Override
    public int compareTo(final Event other) {
        return priority >= other.priority ? 1 : -1;
    }
}
