package com.homework.airport;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorFactory {

    public static ExecutorService get(final int maxThreads) {
        return Executors.newFixedThreadPool(maxThreads);
    }

    private ThreadPoolExecutorFactory() {
    }
}
