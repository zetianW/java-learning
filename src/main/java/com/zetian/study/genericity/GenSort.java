package com.zetian.study.genericity;

import com.zetian.study.base.PairValue;

/**
 * Description   测试功能是否完善
 *
 * @author Zetian Wang
 * @date 2019/10/15
 **/
public class GenSort {

    public static void main(String[] args) {
        String[] words = {"a", "z", "d", "h", "y"};

        //int[] integers = {2,5,1,7,3};
        PairValue<String> pairValue = ArrayAlg.calculationMaxAndMin(words);
        System.out.println("min = " + pairValue.getMax());
        System.out.println("max = " + pairValue.getMin());
    }
}
