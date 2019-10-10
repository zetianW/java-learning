package com.zetian.study.interfaces.thread;

/**
 * Description  Runnable接口实现资源共享。
 *
 * @author Zetian Wang
 * @date 2019/10/09
 **/
public class RunnableTicket {
    public static void main(String[] args) {
        OtherThread mt = new OtherThread();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}

