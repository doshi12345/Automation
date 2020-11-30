package JavaExercise;

public class PowerofaNumber {
	

	    public static void main(String[] args) {

//1
	        
	        
	        int count = 0;
	        int num = 5;
	        int exp = 4;
	        int res = 1;
	        
	        for ( ; count < exp; count++ )
	        {
	        	res = res * num;
	        }
	        System.out.println("Power of num is " + res);
	        
	        
//2
	        int base = 3;
	        int exponent = 4;
	        long result = 1;
	        
	        for ( ;exponent != 0; --exponent)
	        {
	            result *= base;  //result = result * base
	        }

	        System.out.println("Answer = " + result);
	    }
	


//3 Using Power function

    public static void power() {

        int base = 3, exponent = -4;
        double result = Math.pow(base, exponent);

        System.out.println("Answer = " + result);
    }
}
