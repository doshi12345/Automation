package JavaExercise;

import java.util.HashSet;
import java.util.Set;

public class A2ArrayDuplicateElements {

	public static void main(String[] args) {
		
   String names[] = {"Java", "JavaScript", "Ruby", "Python", "C", "Python", "Java"};
		
//1. Compare each element:
		
		for (int i = 0; i < names.length; i++)
		{
			for (int j = i+1; j<names.length;j++)
			{
				if(names[i].contentEquals(names[j]))
				{
					System.out.println("1) Duplicate element is: " + names[i]);
				}
			}
		}
		
		System.out.println("***********");
		
//2. Using HashSet: Java collection; HashSet can only store unique values:
		
		Set <String> store = new HashSet<String>();
		for (String name : names) //Iterating each element in names array to name one at a time
		{
			if(store.add(name) == false) 
			{
				System.out.println("2) Duplicate element is: " + name);
			}
			System.out.println(store);
		}
		
//3. Using Hashmap
		
		
	}
}


