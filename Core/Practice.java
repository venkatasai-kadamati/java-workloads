package Core;

import java.util.ArrayList;
import java.util.Locale;

public class Practice {
    static void main() {
        ArrayList list = new ArrayList();
        list.add("string1");
        list.add("string2");
        list.add(1); // issue causing due to type mismatch

        System.out.println(list);

        String o = (String) list.get(0);
        System.out.println(o.toUpperCase());

        Object o1 = list.get(2);
        System.out.println(o1);
    }
}
