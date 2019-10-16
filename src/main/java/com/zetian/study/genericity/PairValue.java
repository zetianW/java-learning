package com.zetian.study.genericity;

import java.util.List;

/**
 * Description 保存最大值和最小值结果(int,String具体类型取决于泛型指定的类型)
 * Integer是int的包装类
 *
 * @author Zetian Wang
 * @date 2019/10/15
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

