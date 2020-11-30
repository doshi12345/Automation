package BasicConcepts;

public class Singleton {
	
//In OOPS, a singleton class is a class that can have only one object (instance of the class) at a time.
	//How to design singleton class:
		//1. How to make constructor as private
		//2. How to write a public static method that has return type of object of this singleton class(lazy Initialization)
			
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton()  //Private Constructor
	{
		str = "Hey, I am using singleton class pattern";
	}
	
	public static Singleton getInstance() {  //public static method return type singleton instance
		if (singleton_instance == null)
		{
			singleton_instance = new Singleton();
		}
		return singleton_instance;
	}
	
	public static void main(String[] args) {

		//Initially ref variable singleton_instance was pointing to null
		
		Singleton x = Singleton.getInstance();  
		//Right side: New object is created and singleton_instance will be pointing to new object created
		//Left side: Ref var x will be equal to ref var singleton_instance and both will point to new object created
		
		Singleton y = Singleton.getInstance(); 
		//2nd time getInstance() method is called and this time singleton_instance is not null so 
		//it will return same ref variable pointing to same object as before
		
		Singleton z = Singleton.getInstance(); 
		//y  and z also will point to same object; it will not create new objects with ref variable y and z
		
		x.str = (x.str).toUpperCase(); //x ref variable - object which has str will be all uppercase
		System.out.println(singleton_instance.str);
		System.out.println(x.str);
		System.out.println(y.str); 
		System.out.println(z.str); 
		//y.str and z.str will also point to same object as y and z are singleton class ref variable
		
		z.str ="Singleton";
		System.out.println(singleton_instance.str);
		System.out.println(x.str);
		System.out.println(y.str); 
		System.out.println(z.str); 
		
	}

}
