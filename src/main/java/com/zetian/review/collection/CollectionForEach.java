package com.zetian.review.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/27
 **/
public class CollectionForEach {
    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        all.add("wang");
        all.add("ze");
        all.add("tia");
        all.forEach(System.out::println);
    }
}
