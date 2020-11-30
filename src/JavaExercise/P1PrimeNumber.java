package JavaExercise;

import java.util.Scanner;

public class P1PrimeNumber {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		
		
		int temp = 0;
		for (int i = 2; i < num; i++)
		{
			if(num%i ==0) 
			{
				temp = temp + 1;
				
			}
			
		}
		
		if (temp == 0)
		{
			System.out.println( num + " is a Prime number");
		}
		else
		{
			System.out.println( num + " is not a Prime number");
		}
		
		//for Prime numbers between 1 and 100, insert a for loop for(int num=1; num<101;num++)
		//between lines 14 and 33
		//This is exactly the next class

	}
}

