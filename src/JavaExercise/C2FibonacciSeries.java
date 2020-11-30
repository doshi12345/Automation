package JavaExercise;

public class C2FibonacciSeries {

	public static void main(String[] args) {

		//0 1 1 2 3 5 8 13 21 34 ....
		
		int count = 10;
		int sum = 0;
		//Starting numbers t1 and t2
		int t1 = 0;
		int t2 = 1;
		
		
		for(int i = 1; i<=count; i++){
			
			System.out.println(t1);
		    sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		
		
		
	}

}
