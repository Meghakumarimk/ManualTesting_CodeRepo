package package_1;

public class simpleIntrest 
{
	public float calculateSimpleIntrest(float principle, float ROI, float time) 
	{
		float simpleIntrest;
		simpleIntrest = (principle*ROI*time)/100;
		return simpleIntrest;
	}
	
	public static void main(String[] args) 
	{
		simpleIntrest obj = new simpleIntrest();
		float simpleIntrest = obj.calculateSimpleIntrest(5, 3, 4);
		System.out.println(simpleIntrest);
	}
}
