class largestdigit
{	public static int sum(int num)
	{
		int large=0;
		int digit;
		while (num>0)
		{
			digit=num%10;
			if (digit>large){
				large=digit;
			}
			num=num/10;
		}
		return large;
	}
	public static void main(String[] args) 
	{
		int result;
		result=sum(7124);
		System.out.println(result);
	}
}