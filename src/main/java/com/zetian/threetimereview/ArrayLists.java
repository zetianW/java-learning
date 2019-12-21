package com.zetian.threetimereview;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/21
 **/
public class ArrayLists {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        all.add("1");
        all.add("2");
        all.add("3");
        Iterator s = all.iterator();
        while(s.hasNext()){
            System.out.println(all);
            break;
        }
    }
}
