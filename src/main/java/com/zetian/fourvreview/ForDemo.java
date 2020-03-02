package com.zetian.fourvreview;


import java.util.Arrays;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/02
 **/
public class ForDemo {
    public static void main(String[] args) {
        int[] all = new int[4];
        int[] arr = new int[4];
        all[0] = 1;
        all[1] = 2;
        all[2] = 3;
        all[3] = 4;
        for (int i = 0; i <all.length ; i++) {
            all[i] = all[all.length-i-1];
            System.out.println(Arrays.toString(arr));
        }
    }
}
