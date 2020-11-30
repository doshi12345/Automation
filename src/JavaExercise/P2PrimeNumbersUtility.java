package JavaExercise;


public class P2PrimeNumbersUtility {

	
		
		public static boolean isPrime(int n) 
		{
			// Corner case 
	        if (n < 2) 
	            return false; 
	  
	        // Check from 2 to n-1 
	        for (int i = 2; i < n; i++) 
	            if (n % i == 0) 
	                return false; 
	  
	        
	        return true; 
		}
		
		
		public static void main(String[] args) 
		{

			int number = 9;
			System.out.println(isPrime(number));
		
		}
					
			
			
			
	
		}
			
			

