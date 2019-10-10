package com.zetian.learned.video;

/**
 * Description     have a problem
 * 为啥最后调用重载方法的时候那个方法重载四个字不出来呢？
 *
 * @author Zetian Wang
 * @date 2019/09/22
 **/
public class OverLoadTest {
    int x;

    OverLoadTest() {
        System.out.println("无参数构造方法");
        x = 30;
    }

    OverLoadTest(int i) {
        System.out.println("有参数构造");
        x = i;
    }
    void info(){
        System.out.println("洗衣机的高度为"+x);
    }
    void info(String str){
        System.out.println("洗衣机的高度为"+x);
    }

    public static void main(String[] args) {
        OverLoadTest e =new OverLoadTest(300);
        e.info();
        e.info("方法重载");
    }
}