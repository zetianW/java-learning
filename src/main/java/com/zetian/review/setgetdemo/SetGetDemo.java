package com.zetian.review.setgetdemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/04
 **/
public class SetGetDemo {
    private String fruit;
    private double price;
    private int kg;

   // public SetGetDemo(String fruit,double price,int kg){
     //   this.fruit = fruit;
       // this.price = price;
        //this.kg = kg;
    //}
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setKg(int kg) {
        this.kg = kg;
    }

    public int getKg() {
        return kg;
    }

    public static void main(String[] args) {
        //使用普通方法进行算账
        SetGetDemo fruit = new SetGetDemo();
        fruit.setFruit("苹果");
        fruit.setPrice(2.4);
        fruit.setKg(7);
        System.out.println("水果名称："+fruit.getFruit()+"价格："+fruit.getPrice()+"斤数："+fruit.getKg());
        System.out.println("苹果总价："+fruit.getPrice()*fruit.getKg());
        SetGetDemo fruits = new SetGetDemo();
        fruits.setFruit("香蕉");
        fruits.setPrice(2.5);
        fruits.setKg(5);
        System.out.println("水果名称："+fruits.getFruit()+"价格："+fruits.getPrice()+"斤数："+fruits.getKg());
        System.out.println("香蕉总价："+fruits.getPrice()*fruits.getKg());
        //使用list集合进行算账
       // List<SetGetDemo> all = new ArrayList<>();
        // all.add(new SetGetDemo("水蜜桃",5.5,9));
        // all.add(new SetGetDemo("火龙果",2.5,1));
        // all.add(new SetGetDemo("橙子",2.5,4));
       // all.stream().map((x)->x.getprice()*x.getKg()).forEach(System.out::println );
    }
}




