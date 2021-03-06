package com.zetian.study.interfaces.clone;


import com.zetian.study.base.Employee;

/**
 * Description 员工类的克隆功能
 *
 * @author Zetian Wang
 * @date 2019/10/09
 **/
public class EmployeeClone {
    public static void main(String[] args) {
        /**
         * 使用try...catch语句来实现数据的copy；
         */
        try {
            Employee original = new Employee("John", 5000);
            original.setHireDay(2000, 1, 1);
            Employee copy = original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(2002, 12, 31);
            System.out.println("original=" + original);
            System.out.println("copy=" + copy);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
