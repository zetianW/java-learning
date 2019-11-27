package com.zetian.review.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/27
 **/
public class  ClloctionsStream {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("hello");
        all.add("world");
        all.add("hello");
        all.add("猪");
        all.add("hello");
        all.add("world");
        //取得了Stream类的对象
        Stream<String> stream = all.stream();
        //去除掉所有的重复数据后形成的集合数据，里面是不包含重复内容的集合
        List<String> newAll = stream.distinct().collect(Collectors.toList());
        newAll.forEach(System.out::println);

    }
}
