package com.zetian.study.base;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Description  克隆Employee类的实例，然后调用两个更改器方法。
 *
 * @author Zetian Wang
 * @date 2019/10/09
 **/
public class Employee implements Cloneable {
    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        /**
         * 因为 com.zetian.study.clone()在 Object中是保护访问的，
         * 调用 com.zetian.study.clone()必须通过将 com.zetian.study.clone()改写公共访问的类引用来完成。
         */
        Employee cloned = (Employee) super.clone();
        /**
         * 克隆可变的字段
         */
        cloned.hireDay = (Date) hireDay.clone();
        return cloned;
    }

    /**
     * setHireDay改变hireDay域的状态
     *
     * @param year
     * @param month
     * @param day
     */
    public void setHireDay(int year, int month, int day) {
        /**
         * 实例字段变换的例子     GregorianCalendar(公历)
         */
        Date newHireDay = new GregorianCalendar(year, month - 1, day).getTime();
        hireDay.setTime(newHireDay.getTime());
    }

    /**
     * raiseSalary会改变salary域的值
     *
     * @param byPercent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    @Override
    public String toString() {
        return "EqualsEmployee[name=" + name + ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }
}
