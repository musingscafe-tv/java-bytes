package com.musingscafe.threads;

class Printer extends Thread {
    private final int value;

    Printer(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        ThreadUtil.sleep(100);
        System.out.println(value);
    }

    public static Printer newPrinter(int value) {
        return new Printer(value);
    }
}
