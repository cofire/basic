// 懒汉式单例模式
public class MySingleton{
	// 设立静态变量
	private static MySingleton mySingleton = null;

	private MySingleton(){
		// 私有化构造函数
		System.out.println("懒汉单例模式开始调用构造函数.");
	}

	public static MySingleton getInstance(){
		System.out.println("懒汉式单例模式开始调用公有方法返回实例.");
		if(MySingleton.mySingleton==null){
			System.out.println("懒汉式构造函数的实例还没有构建.");
			mySingleton = new MySingleton();
		}else{
			System.out.println("懒汉式构造函数的实例已创建。");
		}
		System.out.println("方法调用结束，返回单例。");
		return mySingleton;
	}
}