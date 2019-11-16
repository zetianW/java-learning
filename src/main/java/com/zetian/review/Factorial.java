package com.zetian.review;

/**
 * Description   用递归算4的阶乘
 *
 * @author Zetian Wang
 * @date 2019/11/14
 **/
public class Factorial {

    public static void main(String[] args) {
        //对factorial方法进行调用
        factorial(4);
    }
    /**
     *   //定义方法
     * @param n
     * @return
     */
    public static int factorial(int n) {
        if (n == 0) {
            System.out.println(n + "! = 0");
            return 1;
        } else {
            System.out.println(n);
            //用递归的方法进行阶乘处理
            int temp = n*factorial(n-1);
            System.out.println(n + "! = " + temp);
            return temp;
        }
    }
}

