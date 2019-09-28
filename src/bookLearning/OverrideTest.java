package bookLearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description(描述) 该类用于验证Java方法重写
 *
 * @author Zetian Wang
 * @date 2019/09/12
 **/
public class OverrideTest extends Book{

    @Override
    public void func(){
        System.out.println("OverrideTest覆盖后的方法");
    }

    public static void main(String[] args) {
//        Map map = new HashMap();
//        map.put("name","王泽天");
//        //key(键),value(值)——键值对
//        map.put("age","20");
//
//        System.out.println(map.get("name"));


        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        String[] list2 = new String[5];
        list2[0] = "1";
        list2[1] = "2";
        list2[2] = "3";
        list2[3] = "4";
        list2[4] = "5";
//        for (Object o : list) {
//            System.out.println(o.toString());
//        }
        for (String s : list2) {
            System.out.println(s);
        }
    }
}
