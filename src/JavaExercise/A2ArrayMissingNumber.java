package JavaExercise;

public class A2ArrayMissingNumber {

	public static void main(String[] args) {
		
		
		//int a[] = {1,2,4,5};
		
		//1+2+4+5 = 12
		//1+2+3+4+5 =15
		//15-12 = 3
		
		int a[] = {-3,-2,-1,0,1,2,3,4,5,6,7,8,10};
		
	//1	
		int sum = 0;
		for (int i=0; i <a.length; i++) 
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
	//2	
		int sum1= 0;
		for (int j =-3; j<=10; j++)
		{
			sum1 = sum1 + j;
		}
		System.out.println(sum1);
		
	//3
		System.out.println("Missing number is: " + (sum1-sum));
		
		
		
		
	}

}
