package com.zetian.tempTest;

import com.zetian.study.base.Student;
import org.junit.Test;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/21
 **/


public class PeopleTest {

    @Test
    public void testPeople() {
        Student wangfang = new Student();
        wangfang.setName("姓名：王芳");
        wangfang.setNum("学号：20190101");
        wangfang.setHeight("身高：175cm");
        wangfang.setHeight("体重：50KG");
        String[] wangfangScore = {"10", "12", "15"};
        wangfang.setScore(wangfangScore);
        Student zhangsan = new Student();
        zhangsan.setName("姓名：张三");
        zhangsan.setNum("学号：20190102");
        zhangsan.setHeight("身高:156cm");
        zhangsan.setWeight("体重：45KG");
        String[] zhangsanScore = {"13", "14", "15"};
        zhangsan.setScore(zhangsanScore);

        System.out.println( wangfang.getName() +  wangfang.getNum()+wangfang.getHeight()+wangfang.getWeight());
        String[] w = wangfang.getScore();
        for(String e : w ){
            System.out.println(e);
        }
        System.out.println( zhangsan.getName() +  zhangsan.getNum()+zhangsan.getHeight()+zhangsan.getWeight());
        String[] z = zhangsan.getScore();
        for(String s : z ){
            System.out.println(s);
        }
    }

}
