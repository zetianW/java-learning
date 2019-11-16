package com.zetian.review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/11
 **/
public class HashMapTraverse {
    public static void main(String[] args) {
        /**
         *  创建HashMap对象
          */
        Map<String, Integer> tempMap = new HashMap<String, Integer>(3);
        tempMap.put("a", 2);
        tempMap.put("b", 1);
        tempMap.put("c", 3);
        System.out.println("HashMap遍历");

        /**
         *使用Iterator实现hasNext
         */
        Iterator it = tempMap.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            /**
             * 取得key的值
             */
            String key = (String) entry.getKey();
            /**
             * 取得value的值
             */
            Integer value = (Integer)entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }
    }
}