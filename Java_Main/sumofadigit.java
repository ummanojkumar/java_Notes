class sumofadigit
{	public static int sum(int num)
	{
		int sum=0;
		int digit;
		while (num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int result;
		result=sum(1234);
		System.out.println(result);
	}
}