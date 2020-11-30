package JavaExercise;

public class C1LeapYear {

	public static void main(String[] args) {

		// divisble by 4 for all the century years -- ending with 00

		// century year is leap year only when its perfectly divisble by 400.

		// 1900 is not a leap year
		// 2012 leap year

		int year = 1901;
		boolean leap = false;
		
		
//      FIRST easy way		  
		if (  year%400 == 0   || (year % 4 == 0 && year % 100 != 0)       ) 
		//if year 1. (divisible by 4 and not divisible by 100)  OR  2. (divisible by 400)
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
		
		
//		SECOND same as first almost as if a number is divisible by 400 then it will also be by 100 and 4
		if (  (year % 4 == 0 && year % 100 != 0) || year%400 == 0)    
		//year divisible by 4 and not divisible by 100     OR    year divisible by 400 and 100 and 4
			System.out.println("Specified year is a leap year");
	    else
	        System.out.println("Specified year is not a leap year");

		
//      Third 

		if (year % 4 == 0) 
		{
			if (year % 100 == 0)     //divisible by 4 and 100 both so it is a century year, then check if it is divisible by 400
			{    
				if (year % 400 == 0) { //1600
					leap = true;  
				} 
				else {              //1900
					leap = false;
				}
			} 
			else 
			{
				leap = true; //divisible by 4 but not by 100, so it is not a century year e.g 2016
			}
		} 
		
		else {
			leap = false;
		}
		
		

		if (leap) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not a leap year");
		}

	}

	public void getName() {
		System.out.println("get name method.....");
	}

}
