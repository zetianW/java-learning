package com.zetian.study.genericity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Description
 * 用1-49之间的49个integer对象填充数组，然后随机打乱列表，
 * 并从打乱的列表中选取前6个值。最后将选择的数组进行排序和打印。
 * @author Zetian Wang
 * @date 2019/11/06
 **/
public class ShuffleDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i =1; i<=49;i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        List<Integer> winningCombination = numbers.subList(0,6);
        Collections.sort(winningCombination);
        System.out.println(winningCombination);
    }
}
