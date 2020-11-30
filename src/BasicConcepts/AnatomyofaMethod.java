package BasicConcepts;

import java.lang.*;

public class AnatomyofaMethod {

	public static void main(String[] args) 
	{
		System.out.println(cube(9));
		
		
		int[] array = { 10,15,25,30 };
		System.out.println(findAverage(array));
	}


	public static int cube(int parameter) 
	{
		int result;
		result = parameter*parameter*parameter;
		return result;
	}
	
	 
    //System.out.println("Cleanup completed..."); 
	
	public static double findAverage(int[] a) {
		double result;
		int sum= 0;
		
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		result = (double) sum/ a.length;
		return result;
	}
}


