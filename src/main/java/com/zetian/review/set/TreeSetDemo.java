package com.zetian.review.set;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.zetian.study.base.Book;

import java.util.Set;
import java.util.TreeSet;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/02
 **/
public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Book> all = new TreeSet<>();
        all.add(new Book("Android开发",454.6));
        all.add(new Book("Android开发",454.6));
        all.add(new Book("Android开发",100.2));
        all.add(new Book("Java开发",78.9));
        all.add(new Book("IOS开发",45.6));
        System.out.println(all);

    }
}

