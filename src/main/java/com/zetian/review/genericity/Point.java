package com.zetian.review.genericity;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/20
 **/

public class Point<T> {
    /**
     * //设置的T在point只是一个标记，在使用的时候需要具体进行定义其类型
     */

    private T x;
    private T y;

    public void setX(T x) {
        this.x = x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public T getY() {
        return y;
    }
}