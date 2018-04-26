package com.homework.airport;

import com.homework.airport.domain.Airport;
import com.homework.airport.domain.Terminal;
import com.homework.airport.domain.Trap;
import com.homework.airport.utils.RandomUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class AirportFactory {

    public static Airport getAirport(final String name) {
        final int terminalsCount = RandomUtil.nextInt(5) + 1;
        final List<Terminal> terminals = new ArrayList<>(terminalsCount);
        for (int i = 0; i < terminalsCount; i++) {
            final int trapsCount = RandomUtil.nextInt(4) + 1;
            final List<Trap> traps = new ArrayList<>(trapsCount);
            final String terminalId = String.format("%s_%d", name, i);
            for (int j = 0; j < trapsCount; j++) {
                final Trap trap = new Trap(String.format("%s_%d", terminalId, j));
                traps.add(trap);
            }
            final Terminal terminal = new Terminal(terminalId, traps);
            terminals.add(terminal);
        }
        final Airport airport = new Airport(name, terminals);
        log.info("Created airport {}", airport);
        return airport;
    }

    private AirportFactory() {
    }
}
