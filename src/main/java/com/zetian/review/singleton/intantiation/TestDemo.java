package com.zetian.review.singleton.intantiation;

import com.zetian.review.singleton.intantiation.Instantiation;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/25
 **/
public class TestDemo {
    public static void main(String[] args) {
        Instantiation ins = Instantiation.getInstance();
        ins.print();
    }
}