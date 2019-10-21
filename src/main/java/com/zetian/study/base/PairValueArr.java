package com.zetian.study.base;

import com.zetian.tempTest.Student;

/**
 * Description   1.保存两个值
 * 2.获取最大值最小值(两个)。
 *
 * @author Zetian Wang
 * @date 2019/10/19
 **/
public class PairValueArr<T> {

    private T[] result;

    public T[] getResult() {
        return result;
    }
    public void setResult(T[] arr) {
        this.result = arr;
    }
}



