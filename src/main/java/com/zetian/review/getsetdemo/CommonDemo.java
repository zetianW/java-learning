package com.zetian.review.getsetdemo;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/05
 **/
public class CommonDemo {
        public static void main(String[] args) {
            SetGet fruit = new SetGet();
            fruit.setFruit("苹果");
            fruit.setPrice(2.4);
            fruit.setKg(7);
            System.out.println("水果名称："+fruit.getFruit()+"价格："+fruit.getPrice()+"斤数："+fruit.getKg());
            double one = fruit.getPrice()*fruit.getKg();
            System.out.println(one);
            SetGet fruits = new SetGet();
            fruits.setFruit("香蕉");
            fruits.setPrice(2.5);
            fruits.setKg(5);
            System.out.println("水果名称："+fruits.getFruit()+"价格："+fruits.getPrice()+"斤数："+fruits.getKg());
            double two = fruits.getKg()*fruits.getPrice();
            System.out.println(two);
            System.out.println("总价："+(two+one));
        }
    }

