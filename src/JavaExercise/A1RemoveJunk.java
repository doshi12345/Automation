package JavaExercise;

public class A1RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "平仮�??stringabc片仮�??numbers 123漢字gh%^&*#$1@):";
		
		//Regular Expression: [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "-"); // ^ symbol is used for not/except
		System.out.println(s);
	}}
	
