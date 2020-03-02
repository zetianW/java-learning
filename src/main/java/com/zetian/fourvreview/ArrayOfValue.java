package com.zetian.fourvreview;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/28
 **/
public class ArrayOfValue {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 99;
        arr[1] = 98;
        arr[2] = 97;
        arr[3] = 96;
        int length = arr.length;
        System.out.println(length);
        int element = arr[2];
        System.out.println(element);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
