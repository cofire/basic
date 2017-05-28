public class MySingletonTest {
	public static void myprint(){
		System.out.println("懒汉单例模式开始");
		System.out.println("第一次取得实例");
		MySingleton s1=MySingleton.getInstance();
		System.out.println("第二次取得实例");
		MySingleton s2=MySingleton.getInstance();
		if(s1==s2){
			System.out.println("s1和s2为同一实例。");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		myprint();
	}
}