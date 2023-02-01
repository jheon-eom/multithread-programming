package com.learn.multithread._00_thread._01_implements;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable 인터페이스를 구현해서 만든 스레드");
        }
    }

}
