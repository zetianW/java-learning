package com.zetian.threetimereview;


/**
 * Description
 * 计算十个人排序，
 *
 * @author Zetian Wang
 * @date 2019/12/09
 **/
public class Factorials {
    public static void main(String[] args) {
        factorial(10);
    }

    public static int factorial(int n) {
        if (n == 0) {
            System.out.println(n + "! = 0");
            return 1;
        } else {
            System.out.println(n);
            int temp = n * factorial(n - 1);
            System.out.println(temp);
            return temp;
        }
    }
}


