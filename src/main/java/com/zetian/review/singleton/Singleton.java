package com.zetian.review.singleton;
/**
 * Description
 * @author Zetian Wang
 * @date 2019/12/01
 **/

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }  //构造方法私有化

    public static Singleton getInstance() {
        /**
         * 此时还没有实例化
         */
        if (instance == null) {
            /**
             * 实例化对象
             */
            instance = new Singleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello World!");
    }
}

class TestDemo1 {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.print();
    }
}