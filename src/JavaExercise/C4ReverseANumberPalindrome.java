package JavaExercise;

public class C4ReverseANumberPalindrome {

	public static void main(String[] args) {

		int num = 1234; ///4321
		int reverse = 0;
		int remainder = 0;
		
		
	//Comment/Uncomment shortcut: Ctrl + Shift + C		
	//		 long num = 13784683683692;
	//		 long reverse = 0;
	//		 long remainder =0;
		
		while(num !=0)
		{
			remainder = num % 10;
			reverse = reverse * 10 + remainder; //43
			num = num/10;			
		}
		
		
		System.out.println("reversed number is : " + reverse);	
		
		
	//2. Using StringBuffer method
		long num1 = 1234593877;
		String s = String.valueOf(num1);
		StringBuffer sb = new StringBuffer(s);
		sb = sb.reverse();
		System.out.println(sb);
	}

}
