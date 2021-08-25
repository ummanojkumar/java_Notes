class samllandlarge
{	public static void sl(int num)
	{
		int small=num%10;
		int large=0;
		int digit;
		while (num>0)
		{
			digit=num%10;
			if (digit<small)
			{
				small=digit;
			}
			if (digit>large)
			{
				large=digit;
			}
			num=num/10;
		}
		System.out.println("smallest value is : "+small+" and "+" largest value is : "+large);
	}
	public static void main(String[] args) 
	{
		sl(98451239);
	}
}