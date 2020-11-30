package JavaExercise;

public class FactorialNumber {

	public static void main(String[] args) {

		// !5 = 5x4x3x2x1 = 120
		// !4 = 24
		// !0 = 1

//1st Method  //5*4*3*2*1
		int factorial = 1;
		int number = 6;
		
		for (int i = number; i > 0; i--)   // 
		{  
			
			factorial = factorial * i;
		}
		System.out.println("Factorial of " + number + " is :" + factorial);
		
		
		
//2nd Method   //1*2*3*4*5
		int num = 5;
		int fact = 1;
		
		for (int i = 1; i <= num; i++)  
		{
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is :" + fact);
	



//Using Recursion function [function is calling itself inside the function]

		int num2 = 6;
		long factorial2 = multiplyNumbers(num2);
		System.out.println("Factorial of " + num2 + " = " + factorial2);
		
	}

		public static long multiplyNumbers(int num2)
		{
		if (num2 >= 1)
		    return num2 * multiplyNumbers(num2 - 1);
		else
		    return 1;
		}
}


