package com.musingscafe;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PooledPrinter {
    private final static ExecutorService EXECUTOR_SERVICE = Executors.newFixedThreadPool(100);
    private final CountDownLatch latch;

    public PooledPrinter(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            final RunnablePrinter printer = RunnablePrinter.newRunnablePrinter(i, latch);
            EXECUTOR_SERVICE.submit(printer);
        }
    }

    public void shutdown() {
        EXECUTOR_SERVICE.shutdown();
    }
}
