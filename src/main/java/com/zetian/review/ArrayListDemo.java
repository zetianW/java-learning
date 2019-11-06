package com.zetian.review;

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
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        System.out.println("输入名称(end结束)");
        while (true) {
            System.out.print("# ");
            String input = scanner.next();
            if (input.equals("end")) {
                break;
            }
            list.add(input);
        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
