package com.zetian.review;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/14
 **/
public class Animal {
    public void cry() {
        System.out.println("咕咕咕");
    }
    protected void eat(String drink) {
        cry();
        System.out.println(drink);
    }
}

class Chicken extends Animal {
    @Override
    protected void eat(String drink) {
        System.out.println("water");
    }

    @Override
    public void cry() {
        eat("water");
        System.out.println("嘎嘎嘎");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat("hot water");
    }
}

