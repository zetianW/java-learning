package com.zetian.review.listandthread;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/05
 **/
public class ThreadPractive {
    public static void main(String[] args) {
        Port port = new Port();
        Thread thread1 = new Thread(port);
        thread1.setName("thread1");
        Thread thread2 = new Thread(port);
        thread2.setName("thread2");
        thread1.start();
        thread2.start();
    }
}
