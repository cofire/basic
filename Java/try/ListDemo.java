/**
 * @Author:      liying
 * @DateTime:    2017-05-29 19:24:51
 * @Description: Description
 */

import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("world");
        list.add("haha");

        /*用foreach遍历list*/
        for (String str : list) {
            System.out.println(str);
        }

        /*把链表改为数组遍历*/
        String[] strArray = new String[list.size()];
        list.toArray(strArray);
        for (int i=0; i<strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        /*用迭代器进行相关遍历*/
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}