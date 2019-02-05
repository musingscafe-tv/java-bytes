package com.musingscafe;

/**
 * Hello world!
 *
 */
public class SingleThreaded {
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ThreadUtil.sleep(100);
            System.out.println(i);
        }
        System.out.println(System.currentTimeMillis() - start);
    }
}
