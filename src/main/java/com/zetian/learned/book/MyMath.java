package com.zetian.learned.book;

public class MyMath {
    public static int div(int x,int y)  {
        int result=0;
        System.out.println("1、除法计算开始");
        result=x/y;
        return result;
    }
}
class Test {
    public static void main(String args[]) {
        try {
            System.out.println(MyMath.div(10, 2));
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("2、除法计算结束");
    }
}

