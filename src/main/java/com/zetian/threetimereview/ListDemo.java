package com.zetian.threetimereview;

import com.zetian.learned.video.WhileTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description
 * Set集合的应用
 *
 * @author Zetian Wang
 * @date 2019/12/25
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("从");
        all.add("你");
        all.add("的");
        all.add("全");
        all.add("世");
        all.add("界");
        all.add("路");
        all.add("过");
        Iterator iterator = all.iterator();
        Object[] set = all.toArray();
        while (iterator.hasNext()) {
            for (int i = 0; i < set.length; i++) {
                System.out.println(set[i]);
            }
            break;
        }
    }
}