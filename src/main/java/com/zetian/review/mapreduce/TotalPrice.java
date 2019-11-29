package com.zetian.review.mapreduce;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/29
 **/
public class TotalPrice {
    public static void main(String[] args){
        List<Shopping> all = new ArrayList<Shopping>();
        all.add(new Shopping("豆干",11.5,4));
        all.add(new Shopping("牛奶",4.5,1));
        all.add(new Shopping("饼干",5.1,1));
        all.add(new Shopping("西兰花",2.25,3));
       double total = all.stream().map((x)->x.getAmout()*x.getPrice()).reduce((sum,m)->sum+m).get();
        System.out.println("总价"+total);
    }
}
