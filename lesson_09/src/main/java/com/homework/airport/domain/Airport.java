package com.homework.airport.domain;

import com.homework.airport.ThreadPoolExecutorFactory;
import com.homework.airport.utils.RandomUtil;
import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

@Slf4j
@Data
@ToString(exclude = {"executor", "terminalsCount"})
public class Airport {
    private final String name;
    private final List<Terminal> terminals;
    private final Executor executor;
    private final int terminalsCount;

    public Airport(final String name, final List<Terminal> terminals) {
        if (terminals == null || (terminalsCount = terminals.size()) == 0) {
            throw new IllegalArgumentException("No terminals were found for [" + name + "] airport");
        }
        this.name = name;
        this.terminals = terminals;
        this.executor = ThreadPoolExecutorFactory.get(terminalsCount);
    }

    public void consume(final Event event) {
        CompletableFuture.supplyAsync(this::getTrap, executor)
                .thenAcceptAsync(trap -> trap.consume(event), executor);
    }

    private Trap getTrap() {
        log.info("Selecting trap for airport [{}] in thread [{}]", name, Thread.currentThread().getName());
        return terminals.parallelStream()
                .flatMap(Terminal::getTrapsStream)
                .filter(Trap::isReady)
                .findFirst()
                .orElse(getRandomTrap(getRandomTerminal()));
    }

    private Terminal getRandomTerminal() {
        final int terminalId = RandomUtil.nextInt(terminalsCount);
        return terminals.get(terminalId);
    }

    private Trap getRandomTrap(final Terminal terminal) {
        final List<Trap> traps = terminal.getTraps();
        final int trapIndex = RandomUtil.nextInt(traps.size());
        return traps.get(trapIndex);
    }

}
