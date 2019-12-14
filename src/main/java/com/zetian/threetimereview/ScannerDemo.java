package com.zetian.threetimereview;

import java.util.Scanner;

/**
 * Description
 *   回顾Scanner的例子
 * @author Zetian Wang
 * @date 2019/12/09
 **/
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner all = new Scanner(System.in);
        int num = all.nextInt();
        if(num <= 10){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
