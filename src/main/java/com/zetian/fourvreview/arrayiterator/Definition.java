package com.zetian.fourvreview.arrayiterator;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/24
 **/
public class Definition {
    String name;
    int age;
    public Definition(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}
