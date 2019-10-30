package com.zetian.study.collection;

import java.util.HashMap;
import com.zetian.study.base.Employee;
import java.util.Map;

/**
 * Description 首先将键/值对添加到映射中，
 * 然后，从映射中删除一个键，同时与之对应的值也被
 *删除。最后修改一个与键对应的值，并且调用get方法查看这个值。"
 * @author Zetian Wang
 * @date 2019/10/25
 **/
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Employee> staff = new HashMap<>(4);
        staff.put("144-255464",new Employee("Amy Lee",1000));
        staff.put("567-24-2546",new Employee("Harry Hacker",2000));
        staff.put("157-62-7935",new Employee("Gary Cooper",3000));
        staff.put("456-62-5527",new Employee("Francesca Cruz",4000));
        System.out.println(staff);
        staff.remove("567-24-2546");
        staff.put("456-62-5527",new Employee("Francesca Miller",4000));
        System.out.println(staff.get("157-62-7935"));
        System.out.println(staff);
    }
}
