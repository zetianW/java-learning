package com.zetian.fourvreview;

import com.zetian.learned.video.Array;

import java.util.Arrays;

/**
 * Description
 * 删除数组中的某一个元素
 *
 * @author Zetian Wang
 * @date 2020/03/04
 **/
public class DeleteArrayElement {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //要删除的元素的下标
        int del = 3;
        //创建一个新的数组，是arr数组的长度减1
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            //要删除元素前的元素
            if (i < del) {
                newArr[i] = arr[i];
                //newArr[1] = arr[1]=0
                //删除元素后的元素（等于的时候不取，接着向后一位元素进行取值）
            } else {
                newArr[i] = arr[i + 1];
            }
            //新旧数组的替换
            //arr = newArr;
            //System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(newArr));
    }
}
