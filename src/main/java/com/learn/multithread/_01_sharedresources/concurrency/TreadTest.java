package com.learn.multithread._01_sharedresources.concurrency;

public class TreadTest {

    public static void main(String[] args) {
        /**
         * 스레드를 5개 생성 후 start할 경우
         * 공유변수인 미사일 발사 카운트가 순서대로 증가해서 출력되길 바랐지만,
         * 멀티스레드의 동시성 문제로 인해 뒤죽박죽으로 출력
         *
         * 메모리?를 동기화 해주는 제어자인 synchronized 사용 시 정상적으로 출력
         */
        Thread thread1 = new Thread(() -> {
            Missile.syncShot();
        });
        Thread thread2 = new Thread(() -> {
            Missile.syncShot();
        });
        Thread thread3 = new Thread(() -> {
            Missile.syncShot();
        });
        Thread thread4 = new Thread(() -> {
            Missile.syncShot();
        });
        Thread thread5 = new Thread(() -> {
            Missile.syncShot();
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}
