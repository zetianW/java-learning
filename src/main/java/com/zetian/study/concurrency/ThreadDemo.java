package com.zetian.study.concurrency;

/**
 * Description
 *    一个线程的简单例子
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
        //主线程
        Thread thread1 = new Thread();
        System.out.println(thread1.getName());

        // 创建线程
        MyThread thread = new MyThread();
        System.out.println(thread.getName());

        // 启动线程
        thread.start();
    }

    //{  主线程开始 {子线程开始，结束} 结束}
}
