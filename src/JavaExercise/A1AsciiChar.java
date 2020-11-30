package JavaExercise;

/**
 * 
 * @author NaveenKhunteta
 *
 */
public class A1AsciiChar {

	public static void main(String[] args) {
		System.out.println("ASCII char master");

		char c = 'a'; // small a = 97; capital A = 65
		char d = 'A';
		
		//1st method
		int ascii = c;

		//2nd method
		int asciiNumber = (int) d;

		System.out.println("ASCII value of " + c + ":"+ ascii);
		System.out.println("ASCII value of " + c + ":"+ asciiNumber);

	}

}
