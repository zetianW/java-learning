package com.zetian.review;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Description
 *    在Set集合中使用iterator删除值是2的元素
 * @author Zetian Wang
 * @date 2019/11/16
 **/
public class SetIterator {
    public static void main(String[] args){
        Set set = new HashSet(4);
        set.add(1);
        set.add(2);
        set.add(9);
        set.add(89);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(2)){
                iterator.remove();
            }
        }
        System.out.println(set.toString());
    }
}
