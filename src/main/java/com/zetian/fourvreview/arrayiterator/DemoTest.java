package com.zetian.fourvreview.arrayiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Description
 *
 * @author Zetian Wang
 * @date 2020/02/24
 **/
    public class DemoTest {
        public static void main(String[] args) {
            Set<Definition> set=new HashSet<>();
            set.add(new Definition("a", 100));
            set.add(new Definition("b", 90));
            set.add(new Definition("c", 80));
            set.add(new Definition("d", 65));
            set.add(new Definition("e", 55));

            Iterator<Definition> it=set.iterator();
            while(it.hasNext()){
                Definition s=it.next();
                if(s.age<60){
                    it.remove();
                }
            }

            System.out.println(set);
        }

    }
