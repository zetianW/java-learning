package com.zetian.study.extend.reflection;

import com.zetian.study.extend.Banana;

/**
 * Description 面向对象的语言
 *
 * @author Zetian Wang
 * @date 2019/11/01
 **/
public class BananaJuice extends Banana {
    //当父类中的方法不满足当前业务需求
    //extend ：继承，扩展
    //像一个（不完全是父类）
    public void drink(){

    }

    public static void main(String[] args) {
        BananaJuice bananaJuice = new BananaJuice();
        bananaJuice.eated();
        bananaJuice.drink();
    }
}
