package com.zetian.learned.book;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }  //构造方法私有化

    public static Singleton getInstance() {
        if (instance == null) {   //此时还没有实例化
            instance = new Singleton();  //实例化对象
        }
        return instance;
    }

    public void print() {
        System.out.println("Hello World!");
    }
}

class TestDemo1 {
    public static void main(String args[]) {
        Singleton s = Singleton.getInstance();
        s.print();
    }
}