package package_1;

public class assignment4 {
	
	public assignment4()
	{
		this(7,8,9);
		System.out.println("Default constructor");
	}
	
	public assignment4(int a)
	
	{
		
		this(5,6);
		System.out.println("One parameterised");
	}
	
	public assignment4(int b,int c)
	{
		this();
		System.out.println("Two parameterised");
	}
	public assignment4(int d,int f,int k) 
	{
	
		System.out.println("Three parameterised");
	}
	
	
	
	
	public static void main(String[] args) 
	{
		assignment4 as4 = new assignment4(5);
		
	}
	

}
