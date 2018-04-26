package com.homework.airport.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SleepUtils {

    public static void sleep(final int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            log.error("Oops, something went wrong.", e);
        }
    }

    private SleepUtils() {
    }
}
