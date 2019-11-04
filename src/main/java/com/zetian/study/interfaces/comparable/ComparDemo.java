package com.zetian.study.interfaces.comparable;

import java.util.Scanner;

/**
 * Description
 *    比较输入的两个数是否相同
 * @author Zetian Wang
 * @date 2019/11/04
 **/
public class ComparDemo {
    public static void main(String[] args) {
        /**
         *从键盘输入两个数
         */
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        /**
         * 输出这两个数字
         */
        boolean sz = total(x, y);
        System.out.println(sz);

    }

    public static boolean total(int a, int b) {
        /**
         * 三目运算的方法
         */
        boolean com = (a == b) ? true : false;
        return com;
    }
}
