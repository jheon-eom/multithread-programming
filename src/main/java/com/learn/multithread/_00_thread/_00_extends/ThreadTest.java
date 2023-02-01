package com.learn.multithread._00_thread._00_extends;

public class ThreadTest {

    public static void main(String[] args) {
        SubThread subThread = new SubThread();
//        subThread.run();

        Thread[] threads = new Thread[5];
        System.out.println("thread name : " + Thread.currentThread().getName());

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() ->
                    System.out.println("thread name : " + Thread.currentThread().getName()));
            threads[i].start();
        }

    }

}

