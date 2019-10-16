package com.zetian.study.genericity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description 计算数组中的最大值和最小值
 *
 * @author Zetian Wang
 * @date 2019/10/15
 **/
public class ArrayAlg {

//    /**
//     * 字符串数组的计算
//     * @param a
//     * @return
//     */
//    public static PairValue<String> minmax(String[] a) {
//        if (a == null || a.length == 0) {
//            return null;
//        }
//        String min = a[0];
//        String max = a[0];
//        for (int i = 1; i < a.length; i++) {
//            if (min.compareTo(a[i]) > 0) {
//                min = a[i];
//            }
//            if (max.compareTo(a[i]) < 0) {
//                max = a[i];
//            }
//        }
//    }

    /**
     * 整型数组计算最大数和最小数
     *
     * @param arr
     * @return
     */
    public static PairValue<Integer> calculationMaxAndMin(int[] arr) {

        PairValue<Integer> pairValue = new PairValue<Integer>();

        if (arr == null || arr.length == 0) {
            return pairValue;
        }

        //数组排序
        Arrays.sort(arr);
        int max = arr[0];
        int min = arr[arr.length - 1];
        //把最大最小值添加到“结果保存对象（pairValue）”中
        List<Integer> result = new ArrayList<Integer>();
        result.add(max);
        result.add(min);
        pairValue.setResult(result);

        return pairValue;
    }
}
