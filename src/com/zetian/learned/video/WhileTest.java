package com.zetian.learned.video;

import java.util.Scanner;

/**
 * Description      while 循环范例
 *
 * @author Zetian Wang
 * @date 2019/09/18
 **/
public class WhileTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How much money do you need to retire?");

        double goal = in.nextDouble();
        System.out.print("How much money will you contribute every year?");

        double payment = in.nextDouble();
        System.out.print("Interest rate in %:");
        double interestRate = in.nextDouble();

        double balance = 0;
        int years = 0;

        while (balance < goal) {
            balance += payment;
            double interst = balance * interestRate / 100;
            balance += interst;
            years++;
        }
        System.out.println("You can retire in" + years + "years");
    }
}
