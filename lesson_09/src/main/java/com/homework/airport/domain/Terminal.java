package com.homework.airport.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;
import java.util.stream.Stream;

@AllArgsConstructor
@Data
@EqualsAndHashCode
@ToString
public class Terminal {
    private final String id;
    private final List<Trap> traps;

    public Stream<Trap> getTrapsStream() {
        return traps.stream();
    }
}
