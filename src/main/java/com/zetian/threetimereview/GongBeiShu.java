package com.zetian.threetimereview;

import java.util.Scanner;

/**
 * Description
 *  从键盘输入两个数字，求他们的公倍数
 * @author Zetian Wang
 * @date 2019/12/18
 **/
public class GongBeiShu {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int a, b, i, j = 1, k;
        a = reader.nextInt();
        b = reader.nextInt();
        for (i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                j = i;
            }
        }
        k = j * (a / j) * (b / j);
        System.out.println(a + "与" + b + "的最大公约数是" + j);
        System.out.println(a + "与" + b + "的最小公倍数是" + k);
    }
}

