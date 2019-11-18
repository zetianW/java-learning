package com.zetian.review.binarytrees;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/18
 **/
public class Book implements Comparable<Book> {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public int compareTo(Book o) {
        if (this.price > o.price) {
            return 1;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 0;
        }
    }
}

