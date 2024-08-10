package package_1;

public class thisKeyword {
	
	public void method()
	{
		System.out.println("Default method");
		this.method1(1);
	}
	public void method1(int a)
	{
		System.out.println("One parameterised method");
		this.method2(2, 3);
	}
	public void method2(int a,int b)
	{
		System.out.println("Two parameterised method");
		this.method4(1, 2, 3, 4);
		
	}
	public void method3(int a,int b,int c)
	{
		System.out.println("Three parameterised method");
		this.method();
	}
	public void method4(int a,int b,int c,int d)
	{
		System.out.println("Four parameterised method");
	}
	
	public static void main(String[] args) {
		thisKeyword obj = new thisKeyword();
		obj.method3(1, 2, 3);
	}

}
