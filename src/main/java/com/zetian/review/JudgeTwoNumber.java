package com.zetian.review;

/**
 * Description
 *  判断一串字符是否为数字字符
 * @author Zetian Wang
 * @date 2019/11/18
 **/
public class JudgeTwoNumber {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(isNumber(str));
    }
    public static boolean isNumber(String temp) {
        char data [] =temp.toCharArray();
        for (int x = 0; x <data.length ; x++) {
            if(data[x]>'9'||data[x]<'0') {
                return false;
            }
        }
        return true;
    }
}
