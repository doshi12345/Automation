package JavaExercise;

import java.util.ArrayList;

public class P4PrimeNumbersUtility1to100ArrayList {

	public static void main(String[] args) {

		
	ArrayList<Integer> primeList = new ArrayList<Integer>(1) ;
	ArrayList<Integer> notprimeList = new ArrayList<Integer>(1) ;
	
	int p;
	for (p=2; p<101; p++)
		{			
			if (isPrime(p) == true) 
		
				{
					primeList.add(p);
					}
			
			else 
				{
					notprimeList.add(p);
				}
	
		}
		System.out.println("Prime numbers are: " + primeList);
		System.out.println("Non-Prime numerbs are: " + notprimeList);
		System.out.println(isPrime(9));
		
	}
	
	
	
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
	}


