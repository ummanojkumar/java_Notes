class smallestdigit
{	public static int sm(int num)
	{
		int small=num%10;
		int digit;
		while (num>0)
		{
			digit=num%10;
			if (digit<small)
			{
				small=digit;
			}
			num=num/10;
		}
		return small
		;
	}
	public static void main(String[] args) 
	{
		int result;
		result=sm(79966124);
		System.out.println(result);
	}
}