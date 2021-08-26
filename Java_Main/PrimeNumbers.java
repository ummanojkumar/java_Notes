class PrimeNumbers
{
	public static void main(String[] args)
	 {
	 	int num=20;
		for(int x=2;x<=num;x++)
		{	
			int count=0;
			for (int y=2;y<x;y++)
			{
				if (x%y==0)
				{
					count++;
				}
			}
			if (count==0)
			{
				System.out.println(x);
			}
		}
	}
}