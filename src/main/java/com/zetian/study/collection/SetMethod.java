package com.zetian.study.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * Description  从System.in中读取单词，
 * 然后将它们添加到集中，
 * 然后，再打印出集中所有的单词
 *
 * @author Zetian Wang
 * @date 2019/10/24
 **/
public class SetMethod {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        long totalTime = 0;
        Scanner in = new Scanner(System.in);
        try {
            while (in.hasNext()) {
                //读取下一个输入的内容
                String word = in.next();
                //调用Date包下的currentTimeMillis方法
                long callTime = System.currentTimeMillis();
                words.add(word);
                callTime = System.currentTimeMillis() - callTime;
                totalTime += callTime;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
