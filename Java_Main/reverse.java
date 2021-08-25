class reverse{
	public static void rev(int num)
	{
		int lastdigit;

		while (num>0)
		{
			lastdigit=num%10;
			System.out.println(lastdigit);
			num=num/10;
		}
	}
	public static void main(String[] args) {
		rev(12345);
		
	}
}