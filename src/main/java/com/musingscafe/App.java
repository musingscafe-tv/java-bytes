package com.musingscafe;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        SingleThreaded singleThreaded = new SingleThreaded();
//        singleThreaded.run();

//        MultiThreaded multiThreaded = new MultiThreaded();
//        multiThreaded.run();

        CountDownLatch latch = new CountDownLatch(100);
        PooledPrinter pooledPrinter = new PooledPrinter(latch);
        long start = System.currentTimeMillis();
        pooledPrinter.run();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(System.currentTimeMillis() - start);
        pooledPrinter.shutdown();
    }
}
