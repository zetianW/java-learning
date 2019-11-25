package com.zetian.review.intantiation;

/**
 * Description
 *     添加实例化对象
 * @author Zetian Wang
 * @date 2019/11/25
 **/
public class Instantiation {
    private static Instantiation instance;

    private Instantiation() {
    }

    public static Instantiation getInstance() {

        if (instance == null) {

            instance = new Instantiation();
        }
        return instance;
    }

    public void print() {
        System.out.println("实例化对象例子");
    }
}
