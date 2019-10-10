package com.zetian.learned.video;

public class Father {
    public void eat() {
        System.out.println("辣条");
    }

    protected void sing(String song) {
        eat();
        System.out.println(song);
    }
}

class Son extends Father {
    protected void sing(String Song) {
        System.out.println("凉凉");
    }

    public void eat() {
        sing("凉凉");
        System.out.println("大刀肉辣条");
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.sing("盗将行");


    }
}


