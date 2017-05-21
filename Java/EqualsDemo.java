public class EqualsDemo{
	public static void main(String[] args) {
		String s1=new String("foo");
		String s2=new String("foo");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

		// Integer a=new Integer(10);
		// Integer b=new Integer(10);
		int a=10;
		int b=10;
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
}