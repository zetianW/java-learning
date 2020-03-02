package com.zetian.threetimereview;

/**
 * Description
 *         递归方法的调用
 * @author Zetian Wang
 * @date 2019/12/30
 **/
public class Recursion {
    public static void main(String[] args) {
        recursion(8);
    }

    public static int recursion(int n) {
        if (n == 0) {
            System.out.println(n + "! = 0");
            return 1;
        } else {
            System.out.println(n);
            int temp = n * recursion(n - 1);
            System.out.println(n + "! = " + temp);
            return temp;
        }
    }
}
