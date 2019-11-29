package com.zetian.review.mapreduce;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *   算出每种商品所对应购买斤数的各自的总价
 * @author Zetian Wang
 * @date 2019/11/29
 **/
public class TheirPrice {
    public static void main(String[] args) {
        List<Shopping> all = new ArrayList<Shopping>();
        all.add(new Shopping("糖果",10.1,2));
        all.add(new Shopping("橘子",2.5,4));
        all.add(new Shopping("苹果",5.1,1));
        all.add(new Shopping("西红柿",1.1,5));
        all.stream().map((x)->x.getAmout()*x.getPrice()).forEach(System.out::println );
    }
}
