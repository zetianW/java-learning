package com.zetian.learned.book;

import com.zetian.learned.book.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Description(描述) 该类用于验证Java方法重写
 *
 * @author Zetian Wang
 * @date 2019/09/12
 **/

public class OverrideTest extends Book {

    @Override
    public void func(){
        System.out.println("OverrideTest覆盖后的方法");
    }

    public static void main(String[] args) {

        List lists = new ArrayList();
        lists.add("1");
        lists.add("2");
        lists.add("3");
        lists.add("4");
        lists.add("5");

        String[] list2 = new String[5];
        list2[0] = "1";
        list2[1] = "2";
        list2[2] = "3";
        list2[3] = "4";
        list2[4] = "5";
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
