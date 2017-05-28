/**
 * @Author:      liying
 * @DateTime:    2017-05-28 14:58:04
 * @Description: 使用SimpleDateFormat格式化输出日期
 */

import java.util.*;
import java.text.*;

public class SimpleDateFormatDemo{
    public static void main(String[] args) {
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

        System.out.println("Current Date:" + ft.format(dNow));
    }
}