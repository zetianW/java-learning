package com.zetian.learned.video;

import java.util.Scanner;

/**
 * Description    for循环应用程序实例
 *
 * @author Zetian Wang
 * @date 2019/09/19
 **/
public class ForTest {
    public static void main(String []args) {
        Scanner in =new Scanner(System.in);
        System.out.print("How many numbers do you need to draw?");
        int k=in.nextInt();

        System.out.print("What is the highest number you can draw?");
        int n =in.nextInt();
        int ForTest = 1;
        for(int i=1;i<=k;i++){
            ForTest =ForTest*(n-i+1)/i;
        }
        System.out.println("your odds are 1 in"+ForTest+".Good luck!");

    }

}
