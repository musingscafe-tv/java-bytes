package com.musingscafe;

import java.util.concurrent.CountDownLatch;

public class RunnablePrinter implements Runnable {
    private final int value;
    private final CountDownLatch latch;

    public RunnablePrinter(int value, CountDownLatch latch) {
        this.value = value;
        this.latch = latch;
    }

    @Override
    public void run() {
        ThreadUtil.sleep(100);
        System.out.println(value);
        latch.countDown();
    }

    public static RunnablePrinter newRunnablePrinter(int value, CountDownLatch latch) {
        return new RunnablePrinter(value, latch);
    }
}
