package com.zetian.fourvreview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/09
 **/
public class MapDemo {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>(3);
        map.put("wang",39);
        map.put("ze",40);
        map.put("tian",50);
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Integer value = (Integer) entry.getValue();
            System.out.println("key"+key+" "+"value"+value);
        }

    }
}
