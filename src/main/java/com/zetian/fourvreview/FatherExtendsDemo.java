package com.zetian.fourvreview;

/**
 * Description
 *   关于继承类（父子方法继承）的回顾
 * @author Zetian Wang
 * @date 2020/01/30
 **/
public class FatherExtendsDemo {
    public void eat() {
        System.out.println("鸡肉");
    }

    public void song(String sing) {
        eat();
        System.out.println(sing);
    }
}
class Son extends FatherExtendsDemo {
    /**
     * 子类方法对父类方法的覆写
     */
    @Override
    public void eat(){
        System.out.println("猪肉");
    }
    @Override
    public void song(String sing){
        eat();
        System.out.println("天籁之音");
    }
    public static void main(String[] args){
        FatherExtendsDemo father = new FatherExtendsDemo();
        father.song("父亲");
    }
}
