class palindrome{
	public static int pald(int num)
	{
		int lastdigit;
		int sum=0;
		int temp=num;
		while (num>0)
		{
			lastdigit=num%10;
			sum=(sum*10)+lastdigit;
			num=num/10;
		}
		if (temp==sum)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		return 0;
	}
	public static void main(String[] args) 
	{
		int result;
		result=pald(313);
	}
}