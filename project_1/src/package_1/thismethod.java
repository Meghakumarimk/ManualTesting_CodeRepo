package package_1;

public class thismethod {
	
	public void method1()
	{
		
		System.out.println("This is method1");
		
	}
	
	public void method2()
	{
		System.out.println("This is method2");
		this.method1();
		
	}
	
	public void method3()
	{
		System.out.println("This is method3");
		this.method2();
	
	}
	
	public static void main(String[] args) 
	{
		thismethod obj = new thismethod();
		obj.method3();
		System.out.println("Execution complete.");
	}
	
	
	

}
