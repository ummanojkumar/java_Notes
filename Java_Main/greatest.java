class greatest{
	public static void great(int a,int b,int c)
	{
		int larger=0;
		if (a>b && a>c)
		{
			larger=a;
		}
		else if (b>c && b>a)
		{
			larger=b;
		}
		else {
			larger =c;
		}
		System.out.println(larger);
	}

	public static void main(String[] args)
	 {
		great(3,7,2);
		great(66,99,12);
	}
}