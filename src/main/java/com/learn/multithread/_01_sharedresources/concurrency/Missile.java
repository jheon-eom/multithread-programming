package com.learn.multithread._01_sharedresources.concurrency;

public class Missile {

    public static int COUNT = 0;

    public static void shot() {
        COUNT++;
        System.out.println("미사일 발사 카운트 : " + COUNT);
    }

    // 동기화
    public synchronized static void syncShot() {
        COUNT++;
        System.out.println("미사일 발사 카운트 : " + COUNT);
    }

}
