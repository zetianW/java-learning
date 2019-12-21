package com.zetian.threetimereview;

/**
 * Description
 *  求100以内的素数
 * @author Zetian Wang
 * @date 2019/12/18
 **/
public class PrimeNumber {
    public static void main(String[] args) {
        int[] a = new int[101];
        int i, j = 2;

        while (j < 101) {
            if (a[j] == 0) {
                for (i = j + 1; i < 101; i++) {
                    if (i % j == 0) {
                        a[i] = 1;
                    }
                }
            }
            j++;
        }

        for (int k = 0; k < 101; k++) {
            if (k >= 2 && a[k] == 0) {
                System.out.println(k);
            }
        }
    }

}
