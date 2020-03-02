package com.zetian.fourvreview;

import java.util.Scanner;

/**
 * Description
 *  关于Scanner的回顾
 * @author Zetian Wang
 * @date 2020/01/30
 **/
public class ThreeScanner {
    public static void main(String[] args){
        Scanner all = new Scanner(System.in);
        int a = 10;
        int sum = all.nextInt();
        if(sum <= a){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
