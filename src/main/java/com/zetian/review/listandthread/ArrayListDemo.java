package com.zetian.review.listandthread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/06
 **/
public class ArrayListDemo {
    public static void main(String[] args) {
        /**
         * 输入你想要输入的字符
         */
        Scanner scanner = new Scanner(System.in);
        /**
         * 创建ArrayList对象/
         */
        List<String> list = new ArrayList<String>();
        System.out.println("输入名称(end结束)");
        /**
         * while语句循环输出#及输入的一个个的内容
         */
        while (true) {
            System.out.print("# ");
            String input = scanner.next();
            /**
             * 如果输入end则停止循环
             */
            if (input.equals("end")) {
                break;
            }
            /**
             * 输入的每一个元素
             */
            list.add(input);
        }
        /**
         * 使用迭代器遍历数组并且输出
         */
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
