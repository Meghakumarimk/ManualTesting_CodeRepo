package package_1;

public class arthimetic2 
{
	public static void main(String[] args)
	{
		arthimetic1 obj = new arthimetic1();
		int divResult = obj.div(10, 2);		//5
		int subResult = obj.sub(divResult, 2);	//3
		int mulResult = obj.multi(subResult, 2);	//6
		int subResult1 = obj.sub(mulResult, 2);		//4
		int sumResult = obj.sum(subResult1, 2);		//6
		System.out.println("Final result is : "+sumResult);
		
		
	}
}
