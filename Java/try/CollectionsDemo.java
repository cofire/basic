/**
 * @Author:      liying
 * @DateTime:    2017-05-29 15:18:57
 * @Description: Description
 */

import java.util.*;

public class CollectionsDemo{
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("zara", 8);
        m1.put("sff", 21);
        m1.put("sdf", 32);
        m1.put("sdsf", 14);
        System.out.println();
        System.out.println("Map Elements");
        System.out.println("\t" + m1);
        System.out.println(m1.get("sdf"));
        System.out.println(m1.hashCode());
    }
}