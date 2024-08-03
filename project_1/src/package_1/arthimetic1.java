package package_1;

public class arthimetic1 
{
	/* ------- Addition method -------*/
	public int sum(int a,int b )
	{
		int c= a+b;
				return c;
	}
	/* ------- Subtraction method -------*/
	public int sub(int d,int e)
	{
		int f= d-e;
		return f;
	}
	/* ------- Multiplication method -------*/
	public int multi(int g,int h)
	{
		int i= g*h;
	    return i;
	}
	/* ------- Division method -------*/
	public int div(int j,int k)
	{
		int l= j/k;
		return l;
	}
	
	/* ------- Main method -------*/
	public static void main(String[] args)
	{
		arthimetic1 obj = new arthimetic1();
		int sumResult1 = obj.sum(10, 2);			//10+2
		int sumResult2 = obj.sum(sumResult1, 2);    //10+2+2
		int subResult  = obj.sub(sumResult2,2);		//12
		int mulResult  = obj.multi(subResult, 2);   //24
		int divResult = obj.div(mulResult, 2);	//12
		System.out.println("Final Result : " + divResult);
		
		
		
		
	}

}
