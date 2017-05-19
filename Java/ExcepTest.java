// Catch 语句包含要捕获异常类型的声明。当保护代码块中发生一个异常时，try 后面的 catch 块就会被检查。
// 如果发生的异常包含在 catch 块中，异常会被传递到该 catch 块，这和传递一个参数到方法是一样。
import java.io.*;
// public class ExcepTest{
 
//    public static void main(String args[]){
//       try{
//          int a[] = new int[2];
//          System.out.println("Access element three :" + a[3]);
//       }catch(ArrayIndexOutOfBoundsException e){
//          System.out.println("Exception thrown  :" + e);
//       }
//       System.out.println("Out of the block");
//    }
// }
public class ExcepTest{
  public static void main(String args[]){
    int a[] = new int[2];
    try{
       System.out.println("Access element three :" + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Exception thrown  :" + e);
    }
    finally{
       a[0] = 6;
       System.out.println("First element value: " +a[0]);
       System.out.println("The finally statement is executed");
    }
  }
}