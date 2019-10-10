package com.zetian.study.base;

import java.util.Scanner;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/10/08
 **/
public class ComparableEmployee implements Comparable<ComparableEmployee> {
    private String name;
    private double salary;

    public ComparableEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * (byPercent / 100);
        salary += raise;
    }

    @Override
    public int compareTo(ComparableEmployee otherComparableEmployee) {

        //return Double.compare(this.salary, otherComparableEmployee.salary);
      return this.name.compareTo(otherComparableEmployee.name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = scanner.nextInt();
        //三目运算
        int i = inputInt > 10 ? 1 : (inputInt < 10 ? -1 : 0);
        System.out.println(i);
    }
}


