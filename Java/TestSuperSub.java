// 子类不能继承父类的构造器（构造方法或者构造函数），
// 但是父类的构造器带有参数的，则必须在子类的构造器中显式地通过super关键字调用父类的构造器并配以适当的参数列表。
// 如果父类有无参构造器，则在子类的构造器中用super调用父类构造器不是必须的，
// 如果没有使用super关键字，系统会自动调用父类的无参构造器。

class SuperClass{
	private int n;

	SuperClass(){
		System.out.println("SuperClass()");
	}

	SuperClass(int n){
		System.out.println("SuperClass(int n)");
		this.n=n;
	}
}

class SubClass extends SuperClass{
	private int n;

	SubClass(){
		super(300);
		System.out.println("SubClass");
	}

	public SubClass(int n){
		System.out.println("SubClass(int n)");
		this.n=n;
	}
}

public class TestSuperSub{
	public static void main(String[] args) {
		SubClass sc = new SubClass();
		SubClass sc2 = new SubClass(200);
	}
}