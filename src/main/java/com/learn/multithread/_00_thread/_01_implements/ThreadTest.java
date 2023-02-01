package com.learn.multithread._00_thread._01_implements;

public class ThreadTest {

    public static void main(String[] args) {
        Runnable myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.start();
    }

}
