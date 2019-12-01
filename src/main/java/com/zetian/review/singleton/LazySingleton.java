package com.zetian.review.singleton;

/**
 * Description
 * * 懒汉式单例
 * 1.懒汉式单例在第一次调用的时候实例化
 * 2.懒汉式单例是线程不安全的，
 * 3.要保证线程安全需要对getInstance()方法进行改造  将介绍三种方式来确保线程安全
 *
 * @author Zetian Wang
 * @date 2019/12/01
 **/
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    private static LazySingleton getInstance() {
        if (instance == null) {

            instance = new LazySingleton();
        }
        return instance;
    }

    public void print() {
        System.out.println("世间美好与你环环相扣");
    }

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.print();
    }
}

