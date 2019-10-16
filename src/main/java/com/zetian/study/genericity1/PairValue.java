package com.zetian.study.genericity1;

import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/16
 **/
public class PairValue<T> {
    private List<T> result;

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }

    public T getMax() {
        return this.result.get(0);
    }

    public T getMin() {
        return this.result.get(1);
    }
}
