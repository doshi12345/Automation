package JavaExercise;


public class SwapStrings {

	
	    public static void main(String args[]) 
	    { 
	        // Declare two strings 
	        String a = "HelloP"; 
	        String b = "World"; 
	          
	        // Print String before swapping 
	        System.out.println("Strings before swap: a = " +  
	                                       a + " and b = "+b); 
	          
	        //1) append 2nd string to 1st 
	        a = a + b; 
	          
	        //2) store intial string a in string b 
	        b = a.substring(0,a.length()-b.length()); //Overloaded method which takes 2 integer start index & stop index
	          
	        //3) store initial string b in string a 
	        a = a.substring(b.length());  //Overloaded method taking only 1 integer - starting index
	        
	          
	        // Print String after swapping 
	        System.out.println("Strings after swap: a = " +  
	                                     a + " and b = " + b);         
	    }     
	} 

