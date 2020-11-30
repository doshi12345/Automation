package JavaExercise;

public class B4SwapNumbers {

	public static void main(String[] args) {

		int a = 107;
		int b = -590;
		
		System.out.println("before swapping:");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		System.out.println("after swapping:");
		
//1) Using Temp variable
//		int temp;
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println("a="+a);
//		System.out.println("b="+b);


//2) Using + operator
		
//		a = a-b;//-10
//		b = a+b;//10
//		a = b-a;//20

		
//3) Using * operator
		
		//a = a*b
		//b = a/b
		//a = a/b
		
//4) Bitwise XOR operator
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println("a="+a);
		System.out.println("b="+b);

		
		
	}

}
