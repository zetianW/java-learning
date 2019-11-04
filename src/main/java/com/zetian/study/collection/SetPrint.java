package com.zetian.study.collection;

import java.util.*;

/**
 * Description  从System.in中读取单词，
 * 然后将它们添加到集中，
 * 然后，再打印出集中所有的单词
 *
 * @author Zetian Wang
 * @date 2019/10/24
 **/
public class SetPrint {
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
//    public static void main(String[] args) {
//        Map<String, String> stringMap = new HashMap<>();
//        stringMap.put("key1", "value1");
//        stringMap.put("key2", "value2");
//        stringMap.put("key3", "value3");
//        stringMap.put("key4", "value4");
//
//        Set<Map.Entry<String, String>> entrySet = stringMap.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
//        Iterator<String> iterator = entrySet.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
//    }
}
