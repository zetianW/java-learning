package com.zetian.study.concurrency;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/30
 **/
public class ThreadDemo {

    /**
     * 继承Thread类并重写run方法
     */
    public static class MyThread extends Thread {

        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static void main(String[] args) {

        // 创建线程
        MyThread thread = new MyThread();

        // 启动线程
        thread.start();
    }
}
