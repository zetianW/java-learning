package com.zetian.threetimereview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/11
 **/
public class IteratorDemo {
    public static void main(String[] args) {
        List<String > all = new ArrayList<>();
        all.add("好");
        all.add("好");
        all.add("学");
        all.add("习");
        Iterator it   = all.iterator();
        while(it.hasNext()){
            System.out.println(all);
            break;
        }
    }
}
