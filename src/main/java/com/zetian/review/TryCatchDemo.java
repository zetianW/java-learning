package com.zetian.review;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/15
 **/
public class TryCatchDemo {
    public static void main(String[] args){
        System.out.println(test());
    }
    private static int test(){
        int number = 100;
        try{
            System.out.println("try语句块。。。");
            return number;
        }catch(Exception e){
            System.out.println("处理语句块。。。");
        }finally{
            System.out.println("finally语句块。。。");
            number = 500;
            return number;
        }
    }
}