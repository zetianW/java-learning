package Interfaces;


import java.util.Arrays;


/**
 * Description   对员工信息进行数组式排序
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
        staff[0] = new Employee("Harry",35000);
        staff[1] = new Employee("Carl",75000);
        staff[2] = new Employee("Tony",38000);
        /**
         *  //对staff进行从小到大的排序功能的接口。
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
