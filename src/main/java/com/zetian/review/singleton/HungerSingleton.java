package com.zetian.review.singleton;

/**
 * Description
 *饿汉单例设计模式
 1. 私有化构造函数。
 2. 声明本类的引用类型变量，并且使用该变量指向本类对象。
 3. 提供一个公共静态的方法获取本类的对象。
 * @author Zetian Wang
 * @date 2019/12/01
 **/
public class HungerSingleton {
    /**
     * 构造方法私有化
     */
    private HungerSingleton() {
    }

    /**
     * 实例化对象
     */
    private static HungerSingleton s = new HungerSingleton();

      // private static HungerSingleton z = new HungerSingleton();
    /**
     * 提供公共的访问方式
     // 为了保证外界能够直接使用该方法，加静态
     * @return
     */
    public static HungerSingleton getInstance() {
        return s;
    }

     // public static HungerSingleton getZ() {
      //  return z;
    //}

    public static void main(String[] args) {
        //通过单例得到对象
        HungerSingleton s1 = HungerSingleton.getInstance();
        HungerSingleton s2 = HungerSingleton.getInstance();
        System.out.println(s1 == s2);
    }
}



