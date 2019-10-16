package com.zetian.study.genericity;

/**
 * Description   测试功能是否完善
 *
 * @author Zetian Wang
 * @date 2019/10/15
 **/
public class GenSort {

    public static void main(String[] args) {
        //String[] words = {"Mary", "had", "a", "little", "lamb"};

        int[] integers = {2,5,1,7,3};
        PairValue<Integer> pairValue = ArrayAlg.calculationMaxAndMin(integers);
        System.out.println("min = " + pairValue.getMax());
        System.out.println("max = " + pairValue.getMin());
    }
}
