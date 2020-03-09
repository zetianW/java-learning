package com.zetian.fourvreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Description
 *   在数组中找到对应的值，打印出值的下标
 * @author Zetian Wang
 * @date 2020/03/05
 **/
public class SearchElement {
    public static void main(String[] args) {
        //设置数组，数组的大小为3
        List<String> arr1 = generateList("wang","eight","really");
//        List<String> arr = new ArrayList<>(3);
//        arr.add("wang");
//        arr.add("eight");
//        arr.add("really");
        //目标元素
        String target = "eight";
        //目标元素的下标
        int index = -1;
        for (int i = 0; i <arr1.size() ; i++) {
            //if(arr.equals(target)){   有问题
            if(arr1.get(i).equals(target)){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }


    private static List<String> generateList(String... args){
        List<String> stringList = new ArrayList<>(args.length);
        for (String arg : args) {
            stringList.add(arg);
        }

        return stringList;
    }
}
