package com.zetian.study.genericity2;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/16
 **/
public class PairValue<T> {
    private T[] result;

    public T[] getResult() {
        return result;
    }

    public void setResult(T[] result) {
        this.result = result;
    }

    public T[] getMax() {
        return result;
    }

    public T[] getMin() {
        return this.result;
    }
}

