package package_1;

public class Student 
{
	//This is the property of class "Student"
	String rollNum;
	String phoneNum;
	String name;
	float age;
	
	//This is "eating()" method of class "Student"
	public void eating()
	{
		System.out.println("I am eating");
	}
	
	public boolean isGreaterThan10(int checkNumber)
	{
		
		if(checkNumber > 10)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	//Entry point of program
	public static void main(String[] args)
	{
		//student class ka obj create kar rahe h
		Student stuObj1 = new Student();
		
		boolean result;
		result = stuObj1.isGreaterThan10(5);
		
		if(result == false)
		{
			System.out.println("Number is less than 10");
		}
		else
		{
			System.out.println("Number is greater than 10");
		}
	}
	
}
