// Java 的控制台输入由 System.in 完成。
// 为了获得一个绑定到控制台的字符流，你可以把 System.in 包装在一个 BufferedReader 对象中来创建一个字符流。
// 下面是创建 BufferedReader 的基本语法：
// BufferedReader br = new BufferedReader(new 
//                       InputStreamReader(System.in));

import java.io.*;
public class BRRead{
	public static void main(String[] args) throws IOException{
		char c;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("输入字符，按下‘q’键退出。");
		// 读取字符
		do{
			c = (char) br.read();
			System.out.println(c);
		}while(c!='q');
	}
}