package com.zetian.study.extend;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/01
 **/
public class Banana implements Fruits {

    //是一个
    @Override
    public void eated() {

    }
//可读性
    public static void main(String[] args) {
        Fruits fruit = new Banana();
    }
}
