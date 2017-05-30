/**
 * @Author:      liying
 * @DateTime:    2017-05-30 22:16:04
 * @Description: Description
 */

public class DisplayMessage implements Runnable {
   private String message;
   
   public DisplayMessage(String message) {
      this.message = message;
   }
   
   public void run() {
      while(true) {
         System.out.println(message);
      }
   }
}