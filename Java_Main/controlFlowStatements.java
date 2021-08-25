class controlFlowStatements
{
	public static void ifcondition(int a)
	{
		if (a>5)
		{

			System.out.println(a+" is greater than 5");
		}
		else if (a==5)
		{
			System.out.println(a+" is equal to 5");
		}

		else
		{
			System.out.println(a+" is less than 5");
		}
	}
	public static void main(String[] args) 
	{
		ifcondition(6);
		ifcondition(4);
		ifcondition(33);
		ifcondition(5);
		ifcondition(-1);
		
	}
}