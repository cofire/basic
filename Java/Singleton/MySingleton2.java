public class MySingleton2{
	// 设立静态变量，直接创建实例
	private static MySingleton2 mysingletom2= new MySingleton2();

	private MySingleton2(){
		System.out.println("饿汉式单例模式开始调用构造函数。");
	}

	public static MySingleton2 getInstance(){
		System.out.println("饿汉式单例模式开始调用公有方法返回实例。");
		return mysingletom2;
	}
}