/**
 * @Author:      liying
 * @DateTime:    2017-05-29 20:02:58
 * @Description: Description
 */

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("1", "value1");
        map.put("2", "value2");
        map.put("3", "value3");

        /*方法一：二次取值*/
        System.out.println("通过Map.keySet()遍历所有的key和value");
        for(String key : map.keySet()){
            System.out.println("key=" + key +" value=" + map.get(key));
        }

        /*方法二*/
        System.out.println("通过Map.entrySet()用Iterator遍历key和value");
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            System.out.println("key=" + entry.getKey() + " value=" + entry.getValue());
        }

        /*方法三：推荐使用*/
        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        }

        /*第四种*/
        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v : map.values()) {
           System.out.println("value= " + v);
       }
   }
}