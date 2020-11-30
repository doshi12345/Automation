
package JavaExercise;


public class P3PrimeNumbersFrom1to100 {

	public static void main(String[] args) {

		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number: ");
//		int num = sc.nextInt();
		
	    int temp = 0;
		
		
		for (int num = 2; num <101; num++)
		{
			//int temp = 0;
			for (int i = 2; i < num; i++)
				{
					
						if(num%i == 0) 
						{
							temp = temp + 1;			
						}
				}
					
			if (temp == 0)
			{
				System.out.println(num + " is a Prime number");
			}
			else
			{
				temp = 0; 
				// Important we have to reset value of temp to zero for next loop (next num)
				//If we want to avoid this in else part, we can uncomment line 19 int temp = 0- between for-loops
				//so that the value of temp will be reset to zero before starting inner for-loop
				//System.out.println(num + " is not a Prime number"); //Optional printing non-prime numbers
			}
			
		}	
			
		
			
		}}

		
		
		

		
	


