package com.zetian.study.interfaces.thread;

/**
 * Description  Runnable接口实现资源共享。
 *
 * @author Zetian Wang
 * @date 2019/10/09
 **/
public class RunnableTicket {
    public static void main(String[] args) {
        otherThread mt = new otherThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}

class otherThread implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            if (this.ticket > 0) {
                System.out.println("卖票：ticket" + this.ticket--);
            }
        }
    }
}
