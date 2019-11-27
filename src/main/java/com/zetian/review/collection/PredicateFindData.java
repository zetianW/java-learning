package com.zetian.review.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Description
 *   使用断言判断数据是否存在
 * @author Zetian Wang
 * @date 2019/11/27
 **/
public class PredicateFindData {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>(5);
        all.add("Java");
        all.add("Map");
        all.add("COMEMap ");
        all.add("Ios");
        all.add("Jsp");
        Predicate<String> p1 = (x)->x.contains("Jsp");
        Predicate<String> p2 = (x)->x.contains("Ios");
        //获取Stream类的对象
        Stream<String> stream = all.stream();
        //同时使用两个条件进行判断
        if(stream.anyMatch(p1.or(p2))){
            //if(stream.anyMatch(p1.and(p2)))
            System.out.println("数据存在");
        } else{
            System.out.println("数据不存在");
        }

    }
}
