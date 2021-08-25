class smallest{
	public static void small(int a,int b,int c)
	{
		int smaller=0;
		if (a<b && a<c)
		{
			smaller = a;

		}
		else if (b<c && b<a)
		{
			smaller = b;

		}
		else {
			smaller = c;
		}
		System.out.println(smaller);

	}
	public static void main(String[] args) {
		small(6,1,6);
		small(6,23,44);
		
	}
}