package com.learn.multithread._01_sharedresources.concurrency;

public class TreadTestFor {

    public static void main(String[] args) {
        Thread[] threads = new Thread[50];

        for (int i = 0; i < 50; i++) {
            threads[i] = new Thread(() -> {
                Missile.syncShot();
            });
            threads[i].start();
        }
    }

}
