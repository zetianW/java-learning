package com.zetian.study.equals;


import com.zetian.study.base.Employee;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/09/24
 **/
public class EqualsTest {
    public static void main(String[] args) {
        Employee alice1 = new Employee("Alice Asams",75000,2019,9,28);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alice Adams",75000,2019,9,28);
        Employee bob = new Employee("Bob Brandson", 50000,2019,9,28);
        System.out.println("alice1==alice2:"+(alice1==alice2));
        System.out.println("alice1==alice3:"+(alice1==alice3));
        System.out.println("alice1.main.java.zetian.study.equals(alice3):"+alice1.equals(alice3));
        System.out.println("alice1.main.java.zetian.study.equals(bob):"+alice1.equals(bob));
        System.out.println("bob.toString():"+bob);
        Manager carl =new Manager("Carl Cracker",80000,2019,9,28);
        Manager boss =new Manager("Carl Cracker",80000,2019,9,28);
        boss.setBonus(5000);
        System.out.println("boss.toString():"+boss);
        System.out.println("carl.main.java.zetian.study.equals(boss):"+carl.equals(boss));
        System.out.println("alice1.hashCode():"+alice1.hashCode());
        System.out.println("alice3.hashCode():"+alice3.hashCode());
        System.out.println("bob.hashCode():"+bob.hashCode());
        System.out.println("carl.hashCode()"+carl.hashCode());
    }
}
