package com.zetian.review.judgetwonumber;

/**
 * Description
 *正则表达式判断一串字符是否为数字字符
 * @author Zetian Wang
 * @date 2019/11/18
 **/
public class EasyJudge {
    public static void main(String[] args) {
        String str = "1q23";
        System.out.println(str.matches("\\d+"));
    }
}
