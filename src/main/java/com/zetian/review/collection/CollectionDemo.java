package com.zetian.review.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/27
 **/
public class CollectionDemo {
    public static void main(String[] args)  {
        List<String> all = new ArrayList<String>();
        Collections.addAll(all,"a","b","c","d","e");
        System.out.println(all);
    }
}
