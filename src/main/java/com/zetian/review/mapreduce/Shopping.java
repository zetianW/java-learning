package com.zetian.review.mapreduce;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/29
 **/
public class Shopping {
    /**
     * /商品名称
     */
    private String pname;
    /**
     * 商品单价
     */
    private double price;
    /**
     * 购买数量
     */
    private int amout;

    public Shopping(String pname, double price, int amout) {
        this.pname = pname;
        this.price = price;
        this.amout = amout;
    }

    public String getPname() {
        return pname;
    }

    public double getPrice() {
        return price;
    }

    public int getAmout() {
        return amout;
    }
}
