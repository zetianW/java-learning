package com.zetian.tempTest;

import com.zetian.study.base.PairValueArr;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/19
 **/
public class StudentTest {

    @Test
    public void testStudent() {
        Student xiaoming = new Student();
        xiaoming.setName("小明");
        xiaoming.setNum("20190102001");
        String[] xiaomingScore = {"10", "12", "15"};
        xiaoming.setScore(xiaomingScore);
        Student xiaohua = new Student();
        xiaohua.setName("小华");
        xiaohua.setNum("20190102002");
        String[] xiaohuaScore = {"13", "14", "15"};
        xiaohua.setScore(xiaohuaScore);

        System.out.println("姓名：" + xiaoming.getName() + "学号：" + xiaoming.getNum());
        String[] xS = xiaoming.getScore();

        for (int i = 0; i < xS.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("数学" + xS[0]);
                    break;
                case 1:
                    System.out.println("语文" + xS[1]);
                    break;
                case 2:
                    System.out.println("英语" + xS[2]);
                    break;
                default:
                    System.out.println("没有成绩");
            }
        }
    }
}