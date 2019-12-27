package com.zetian.threetimereview.getsetmethod;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/24
 **/
public class GetSetDemo {
    public static void main(String[] args) {
        GetSet wang = new GetSet();
        wang.setPeopleName("王帅");
        wang.setAges(20);
        wang.setWeight("120");
        GetSet zhang = new GetSet();
        System.out.println("姓名:"+wang.getPeopleName()+" "+"年龄:"+wang.getAges()+" "+"体重:"+wang.getWeight());
        zhang.setPeopleName("张博");
        zhang.setAges(21);
        zhang.setWeight("155");
        System.out.println("姓名:"+zhang.getPeopleName()+" "+"年龄:"+zhang.getAges()+" "+"体重:"+zhang.getWeight());
    }
}
