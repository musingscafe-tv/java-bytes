package com.musingscafe.threads;

import java.util.ArrayList;
import java.util.List;

public class MultiThreaded {

    public void run() {
        final List<Thread> threads = new ArrayList<>();
        final long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            final Thread thread = new Printer(i);
            threads.add(thread);
            thread.start();
        }

        threads.forEach(ThreadUtil::join);
        System.out.println(System.currentTimeMillis() - start);
    }
}

