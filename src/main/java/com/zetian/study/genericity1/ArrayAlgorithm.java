package com.zetian.study.genericity1;

import com.zetian.study.genericity.PairValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/16
 **/
public class ArrayAlgorithm {
    public static PairValue<String> calculationMaxAndMin(String[] arr) {

        PairValue<String> pairValue = new PairValue<String>();

        if (arr == null || arr.length == 0) {
            return pairValue;
        }

        //数组排序
        Arrays.sort(arr);
        String max = arr[0];
        String min = arr[arr.length - 1];
        //把最大最小值添加到“结果保存对象（pairValue）”中
        List<String> result = new ArrayList<String>();
        result.add(max);
        result.add(min);
        pairValue.setResult(result);

        return pairValue;
    }
}

