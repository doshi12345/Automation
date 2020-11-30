package JavaExercise;

public class A2ArrayLargestSmallestInteger {


	public static void main(String args[])
		{
		
		int a[] = new int[]{-10,0, 2, 3, 4, 5, 878787, 87878788};
		
		int large = 0;
		int small = 0;
		
		
		for(int i=0;i<a.length;i++)
			{
			if(a[i]>large)
			large=a[i];
		
			if(a[i]<small)
			small=a[i];
			}
	
		System.out.print("\nThe Smallest element is: "+ small );
		System.out.println("\nThe largest element is: " +large);
		
		}
		}