package BasicConcepts;

	
	class Emp
	{
		int eid;
		int salary;
		static String ceo;
		
		// For static variable, it is same for all the objects created for the class
		// Also we do not need to create an object to call static variable for example we can use Emp.ceo instead of naveen.ceo or rahul.ceo, as 
		// variable string ceo is same for all object (navven, rahul etc) of the class Emp

		public Emp()  // when you create an object everytime Constructor method runs
		{
			eid = 1;
			salary = 3000;
			System.out.println("in constructor"); //This will be printed multiple times in console, as many objects you create
		}
		
		
		static    // when you load a class (Class only loads once)
		{
			ceo = "Larry";
			System.out.println("in static"); //This will be printed only once, no matter how many objects you create
		}
		

		public void show()
		{
			System.out.println(eid + " : " + salary + " : " + ceo);
		}
	}

	public class StaticKeyword
	{
		static int i = 0;
		public static void main(String[] args)
		{
			i = 9;
			
			Emp navin = new Emp();
//			navin.eid = 8;
//			navin.salary = 4000;
//			Emp.ceo = "Mahesh";
			
			Emp rahul = new Emp();
//			rahul.eid = 9;
//			rahul.salary = 5000;
//			Emp.ceo = "Mahesh";   // we dont need object
//			
//			Emp.ceo = "Nikita";
			
			navin.show();
			rahul.show();
		}

	}


