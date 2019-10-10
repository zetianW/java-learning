package com.zetian.study.base;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Description  克隆Employee类的实例，然后调用两个更改器方法。
 *
 * @author Zetian Wang
 * @date 2019/10/09
 **/
public class Employee implements Cloneable, Comparable<Employee> {
    private String name;
    private double salary;
    private Date hireDay;
    private int year;
    private int month;
    private int day;

    /**
     * 一般只要是对构造函数进行了重载，必须保留无参构造函数以防万一
     */
    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        hireDay = new Date();
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.year = year;
        this.month = month;
        this.day = day;
    }


    @Override
    public Employee clone() throws CloneNotSupportedException {
        /**
         * 因为 main.java.zetian.study.clone()在 Object中是保护访问的，
         * 调用 main.java.zetian.study.clone()必须通过将 main.java.zetian.study.clone()改写公共访问的类引用来完成。
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
    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (getClass() != otherObject.getClass()) {
            return false;
        }
        Employee other = (Employee) otherObject;
        return Objects.equals(name, other.name) && salary == other.salary && Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name" + name + ",salary" + salary + ",hireDay=" + hireDay + "]";
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.name.compareTo(otherEmployee.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
