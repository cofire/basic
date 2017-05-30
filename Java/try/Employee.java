/**
 * @Author:      liying
 * @DateTime:    2017-05-30 14:33:13
 * @Description: Description
 */

public class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient int SSN;
   public int number;
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + name
                           + " " + address);
   }
}