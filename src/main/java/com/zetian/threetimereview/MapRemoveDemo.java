package com.zetian.threetimereview;

import com.zetian.study.base.Employee;
import java.util.HashMap;
import java.util.Map;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2019/12/11
 **/
public class MapRemoveDemo {
    public static void main(String[] args){
        Map<String,Employee> in = new HashMap<>(3);
        in.put("111-222",new Employee("Da Lei",3000));
        in.put("111-333",new Employee("Zhao Yang",4000));
        in.put("111-444",new Employee("Wu Lei",5000));
        in.put("111-555",new Employee("Yang Xu",6000));
        //删除Key为111-333所对应的员工信息
        in.remove("111-333");
        //输出Key为111-222的Employee的信息
        System.out.println(in.get("111-222"));
        //替换key值为111-444的员工信息
        in.put("111-444",new Employee("Li Pi",40000));
        //输出删除后，替换后的所有的新的员工信息
        System.out.println(in);
    }
}
