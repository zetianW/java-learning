package com.zetian.fourvreview;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/01/30
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>(4);
        all.add("字符串1");
        all.add("字符串2");
        all.add("字符串3");
        all.add("字符串4");
        for(String i:all){
            System.out.println(i);
        }
    }
}
