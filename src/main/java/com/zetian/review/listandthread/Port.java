package com.zetian.review.listandthread;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/05
 **/
public class Port implements Runnable {

    @Override
    public void run() {
        int j = 10;
        for (int i = 0; i < j; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
