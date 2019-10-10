package com.zetian.study.interfaces.thread;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/10
 **/
class OtherThread implements Runnable {

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
