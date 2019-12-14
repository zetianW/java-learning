package com.zetian.threetimereview;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/14
 **/
public class Father {
    public void driver() {
        System.out.println("快车");
    }

    protected void eat(String drink) {
        driver();
        System.out.println(drink);
    }

    class Son extends Father {
        @Override
        protected void eat(String drink) {
            System.out.println("juice");
        }

        @Override
        public void driver() {
            eat("water");
            System.out.println("慢车");
        }
    }

    public static void main(String[] args) {
        Father father = new Father();
        father.eat("hotwater");
    }
}

