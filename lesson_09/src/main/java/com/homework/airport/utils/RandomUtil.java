package com.homework.airport.utils;

import java.util.Random;

public final class RandomUtil {

    private static final Random RANDOM = new Random();

    public static int nextInt(final int bound) {
        return RANDOM.nextInt(bound);
    }

    private RandomUtil() {
    }
}
