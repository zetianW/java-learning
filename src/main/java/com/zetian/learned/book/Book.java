package com.zetian.learned.book;

public class Book {

    public void func(){
        System.out.println("原方法");
    }

    public void func(String s){
        System.out.println(s);
    }
}    //重载

class Text extends Book {

//    @Override
//    public void func(){
//        System.out.println("覆写/重写");
//        System.out.println("123");
//    }

    public static void main(String[] args) {
        Text text = new Text();
        text.func();
        text.func("父类重载的方法");
    }
}

