package com.zetian.review.genericity;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/11/20
 **/


public class CoordinateDemo {
    public static void main(String[] args) {
        //设置数据
      Point<String> p = new Point<String>();
      p.setX("东经100");
      p.setY("北纬200");
      //取出数据
        String x =p.getX();
        String y =p.getY();
        System.out.println("x坐标"+x+","+"y坐标"+y);
    }
}
