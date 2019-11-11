package com.zetian.review;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *  设置一个List泛型，判断打印出没有添加元素的数组长度及存储是否为空，
 * @author Zetian Wang
 * @date 2019/11/09
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> all = new ArrayList<>();
        System.out.println("长度:"+all.size()+"是否为空："+all.isEmpty());
        all.add("世界");
        all.add("世界");
        all.add("你好");
        System.out.println("长度:"+all.size()+"是否为空："+all.isEmpty());
    }
}
