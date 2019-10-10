package com.zetian.learned.video;

import java.util.Scanner;

/**
 * Description    手动输入实例
 *
 * @author Zetian Wang
 * @date 2019/09/19
 **/
public class ScannerTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("What's your name ?");
        String name =in.nextLine();
        System.out.print("How old are you ?");
        int age =in.nextInt();
        System.out.println("Hello,"+name+  "Next year,you'll be" +(age+1)+"years old");

    }
}
