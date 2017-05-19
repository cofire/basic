public class TestMax{
	public static void main(String[] args) {
		double i=9.6;
		double j=8.3;
		double large=max(i,j);
		System.out.println(large);
	}
	public static int max(int num1,int num2){
		// if(num1>num2){
		// 	return num1;
		// }else{
		// 	return num2;
		// }
		return num1>num2?num1:num2;
	}
	public static double max(double num1,double num2){
		// if(num1>num2){
		// 	return num1;
		// }else{
		// 	return num2;
		// }
		return num1>num2?num1:num2;
	}
}