/**
 * @Author:      liying
 * @DateTime:    2017-05-28 14:49:04
 * @Description: 获取日期和时间
 */

import java.util.Date;
public class DateDemo{
    public static void main(String[] args) {
        /*当前毫秒数*/
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date.toString());
    }
}