package com.zetian.review.innerclass;


/**
 * //外部类
 */
class Outers {
    private String msg = "王先生";
    public String getMsg() {
        return this.msg;
    }

    /**
     * 定义一个内部类
     */
    class Inner {
        private Outers out;
        public Inner(Outers out){
            this.out = out;
        }
        public void print() {
            System.out.println(this.out.getMsg());
        }
    }
    public void fun() {
        //实例化内部类对象，并且调用print()方法
        new Inner(this).print();
    }
}
/**
 *   注释：内部类的使用,调用外部类方法
 * @author Zetian Wang
 * @date 2019/11/19
 **/

public class InnerClassDemo {
    public static void main(String[] args) {
        /**
         * //实例化外部类
         */
        Outers out = new Outers();
        out.fun();   //调用外部类方法
    }
}
