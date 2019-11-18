package com.zetian.review.binarytrees;


import java.util.Arrays;

/**
 * Description
 *   二叉树
 * @author Zetian Wang
 * @date 2019/11/18
 **/
public class BinaryTreeDemo {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Book("java开发", 79.8));
        bt.add(new Book("JSP开发", 88.8));
        bt.add(new Book("Android开发", 99.1));
        Object[] obj = bt.toArray();
        System.out.println(Arrays.toString(obj));
    }
}