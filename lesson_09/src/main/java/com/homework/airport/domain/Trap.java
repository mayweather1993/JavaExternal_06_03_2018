package com.homework.airport.domain;

import com.homework.airport.ThreadPoolExecutorFactory;
import com.homework.airport.utils.SleepUtils;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

import static com.homework.airport.domain.State.BUSY;
import static com.homework.airport.domain.State.READY;

@Slf4j
@ToString(exclude = {"consuming", "executor"})
public class Trap {
    private final String id;
    private AtomicReference<State> state = new AtomicReference<>(READY);
    private final Queue<Event> eventQueue = new PriorityBlockingQueue<>();
    private final Executor executor = ThreadPoolExecutorFactory.get(1);
    private final AtomicBoolean consuming = new AtomicBoolean(false);


    public Trap(final String id) {
        this.id = id;
    }

    public boolean isReady() {
        return state.get() == READY;
    }

    public void consume(final Event event) {
        log.info("Registering event [{}] for trap [{}] in tread [{}]", event.hashCode(), id, Thread.currentThread().getName());
        eventQueue.add(event);
        if (!consuming.get()) {
            executor.execute(new TrapTask(this));
        }
        consuming.compareAndSet(false, true);
    }

    @Slf4j
    private static class TrapTask implements Runnable {

        private final Trap trap;

        private TrapTask(final Trap trap) {
            this.trap = trap;
        }

        @Override
        public void run() {
            final String threadName = Thread.currentThread().getName();
            final int sleepTime = 300;
            SleepUtils.sleep(sleepTime);

            while (true) {
                final boolean eventQueueEmpty = trap.eventQueue.isEmpty();
                trap.state.compareAndSet(eventQueueEmpty ? BUSY : READY, eventQueueEmpty ? READY : BUSY);
                if (eventQueueEmpty) {
                    continue;
                }
                final Event event = trap.eventQueue.poll();
                log.info("Trap [{}] processed event [{}] in thread [{}]", trap.id, event.hashCode(), threadName);
                final int seats = event.getPlane().getSeats();
                SleepUtils.sleep(1000 + (seats * 10));
            }
        }
    }

}
