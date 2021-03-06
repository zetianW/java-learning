package com.zetian.study.interfaces.comparable;



import com.zetian.study.base.Employee;

import java.util.Arrays;


/**
 * Description   对员工信息进行数组式排序
 * 对员工按照薪资大小进行排序
 *
 * @author Zetian Wang
 * @date 2019/10/08
 **/
public class EmployeeSort {
    public static void main(String[] args) {
        /**
         * 定义一个关于三个员工的数组
         */
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Harry",10000);
        staff[1] = new Employee("Carl",75000);
        staff[2] = new Employee("Hany",38000);

        staff[0].raiseSalary(30);
        System.out.println(staff[0].getSalary());
        /**
         * Arrays.sort(Object[] objs)方法
         * 它内部必须把Object数组里面强制转换为Comparable类型，才可以调用comparaTo()方法。
         */
        Arrays.sort(staff);
        /**
         * 打印出所有关于员工信息
         */
        for(Employee e : staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
