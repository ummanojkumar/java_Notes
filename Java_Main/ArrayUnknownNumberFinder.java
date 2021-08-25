class ArrayUnknownNumberFinder
{
	public static void main(String[] args) 
	{
		int a[]={2,5,7};
		int n=10;
		for (int x=1;x<n;x++)
		{
			int count=0;
			for (int y=0;y<a.length;y++)
			{
				if (a[y]!=x)
				{
					count=count+1;
					
				}
				

			}
			if (count==a.length)
			{
				System.out.println(x);
			}

		}
	}
}