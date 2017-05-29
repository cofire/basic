/**
 * @Author:      liying
 * @DateTime:    2017-05-29 13:55:40
 * @Description: Description
 */

import java.util.Vector;
import java.util.Enumeration;

public class EnumerationTest{
    public static void main(String[] args) {
        Enumeration days;
        Vector dayName = new Vector();
        dayName.add("Sunday");
        dayName.add("Monday");
        dayName.add("Tuesday");
        dayName.add("Wednesday");
        dayName.add("Thursday");
        dayName.add("Friday");
        dayName.add("Saturday");
        days = dayName.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}