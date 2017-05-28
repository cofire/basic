public class MySingleton2Test{

	public static void print2(){
		System.out.println("饿汉式单例模式开始");
		System.out.println("第一次");
		MySingleton2 s1= MySingleton2.getInstance();
		System.out.println("第二次");
		MySingleton2 s2= MySingleton2.getInstance();
		if(s1==s2){
			System.out.println("s1和s2是同一实例。");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		print2();
	}
}