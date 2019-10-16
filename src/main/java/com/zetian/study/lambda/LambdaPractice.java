//package com.zetian.study.lambda;
//
//import javax.swing.*;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.Timer;
//
///**
// * Description
// *
// * @author Zetian Wang
// * @date 2019/10/15
// **/
//public class LambdaPractice {
//    public static void main(String[] args) {
//        String[] planets = new String[]{"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
//        System.out.println(Arrays.toString(planets));
//        System.out.println("Sorted in dictionary order:");
//        Arrays.sort(planets);
//        System.out.println(Arrays.toString(planets));
//        System.out.println("Sorted by length:");
//        Arrays.sort(planets, (first, second) -> first.length() - second.length());
//        System.out.println(Arrays.toString(planets));
//
//        System.out.println("The time is" + new Date());
//        Timer t = new Timer("LambdaPractice", true);
//        t.start();
//
//        JOptionPane.showMessageDialog(null, "Quit program?");
//        System.exit(0);
//    }
//}
