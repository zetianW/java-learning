package com.zetian.study.base;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/19
 **/
public class PairValueArrTest {

    /**
     * 测试PairValueArr类的两个功能：
     * 1.保存任意类型的两个值
     * 2.能不能获取到这两个值
     */
    @Test
    public void testPairValueArr(){
        PairValueArr<String> pairValueArr = new PairValueArr<String>();
        //1.创建一个String数组
        String[] arr = {"1","2"};
        //2.将String数组放入到对象中（保存完成）
        pairValueArr.setResult(arr);
        //3.验证是否保存成功
        String[] result = pairValueArr.getResult();

        for (String s : result) {
            System.out.println(s);
        }
    }
}