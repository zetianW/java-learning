package com.zetian.threetimereview.getsetmethod;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/27
 **/
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("w");
        set.add("e");
        set.add("r");
        set.add("t");
        set.add("b");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(set);
            break;
        }
    }
}
