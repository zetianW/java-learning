package com.zetian.study.concurrency;

/**
 * Description
 * 排队叫号系统；假设当前10人排队，共3个窗口工作
 *
 * @author Zetian Wang
 * @date 2019/10/30
 **/
public class TicketWindow extends Thread {
    /**
     * 最大排队人数
     */
    private int maxPersonCount;

    @Override
    public void run() {

        while (true) {
            /**
             * 当超过十个人时窗口上停止叫号
             */
            if (maxPersonCount > 10) {
                System.out.println("停止叫号");
                break;
            }
            /**
             * 输出每个窗口上的叫号情况
             */
            System.out.println(Thread.currentThread().getName() + "-" + maxPersonCount++);

        }
    }

    public static void main(String[] args) {
        TicketWindow thread = new TicketWindow();
        TicketWindow thread1 = new TicketWindow();
        TicketWindow thread2 = new TicketWindow();
        /**
         * 每个窗口实际上都叫了10个号码，没有达到资源共享
         */
        thread.start();
        thread1.start();
        thread2.start();
    }

}

