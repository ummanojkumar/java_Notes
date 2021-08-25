class greatestandsmallest
{
	public static void gs(int a,int b,int c)
	{
		int larger=0; int smaller=0;
		if (a>b && a>c)
		{
			larger=a;
		}
		if (b>c && b>a)
		{
			larger=b;
		}
		if (c>a && c>b)
		{
			larger =c;

	    }
	System.out.println("larger value is : "+larger);
		if (a<b && a<c)
		{
			smaller=a;
		}
		if (b<a && b<c)
		{
			smaller=b;
		}
		if (c<a && c<b)
		{
			smaller=c;
		}
		System.out.println("smaller value is : "+smaller);
	}
	public static void main(String[] args) {
		gs(3,4,5);
		System.out.println();
		gs(10,20,30);
		
	}
}
