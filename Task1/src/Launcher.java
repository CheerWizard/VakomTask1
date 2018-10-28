
public class Launcher {

	public static void main(String []args) {
		//test all
		addition(sumOfSquares(), multiply());
	}
	
	//calculate sum of squares
	private static int sumOfSquares() {
		int a = 0;
		for (int i = 3; i <= 9; i++) a = a + i*i;
		System.out.println("A number equals : " + a);
		return a;
	}
	
	//multiply numbers
	private static int multiply() {
		int b = 1;
		for (int i = 2; i <= 8; i++) b = b*i; 
		System.out.println("B number equals : " + b);
		return b;
	}
	
	//calculate sum of inputed numbers
	private static void addition(int num1 , int num2) {
		final int sum = num1 + num2;
		System.out.println("Sum of A and B numbers : " + sum);
	}
}
