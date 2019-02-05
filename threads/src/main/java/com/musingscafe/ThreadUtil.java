package com.musingscafe;

public class ThreadUtil {
    public static void sleep(long sleepTimeInMillis) {
        try {
            Thread.sleep(sleepTimeInMillis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void join(Thread thread) {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
