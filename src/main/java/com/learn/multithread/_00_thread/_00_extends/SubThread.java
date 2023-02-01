package com.learn.multithread._00_thread._00_extends;

class SubThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 클래스를 상속받은 클래스");
        }
    }

}
