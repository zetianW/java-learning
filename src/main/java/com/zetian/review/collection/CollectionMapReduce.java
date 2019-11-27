package com.zetian.review.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/27
 **/
public class CollectionMapReduce {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>(5);
        all.add("Java");
        all.add("Map");
        all.add("COME");
        all.add("Ios");
        all.add("Jsp");
        try {
            Stream<String> stream = all.stream();
            List<String> newAll = stream.distinct().map((x)->x.toLowerCase()).filter((x)->x.contains("a")).collect(Collectors.toList());
            newAll.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
