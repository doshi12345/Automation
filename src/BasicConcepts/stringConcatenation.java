package BasicConcepts;

public class stringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "World";

		System.out.println(a+b+x+y);   
		//Output will be 300HelloWorld

		System.out.println(x+y+a+b);
		//output will be HelloWorld100200
		//This is called String concatenation, happens left to right
		//In this one string HelloWorld100 will concatenate with 200 and so on
		
		System.out.println(x+y+(a+b));
		//output will be HelloWorld300  due to prenthesis will be given priority

		System.out.println(x+y+a+b+a);
		//Output will be HelloWorld100200100
	}

}
