package com.zetian.review.getsetdemo;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/05
 **/
public class SetGet {
    private String fruit;
    private double price;
    private int kg;


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
}

