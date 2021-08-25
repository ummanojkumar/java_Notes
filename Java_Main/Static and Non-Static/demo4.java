class sample
{
	static int m=24;   // static - data member - 

	public static void test()       // static - function member
	{
		System.out.println("sample function programming is called sucessfully"); 
	}
}







class demo4
{
	static double k=67.34789;  // static - data member
	public static void work()
		{
			System.out.println("calling function form same class");  // static - function member
		}
		
	public static void main(String[] args) 
	{
		
		
		System.out.println("m value is "+sample.m);  // calling static - data member from different class

		sample.test();                          // calling static - data function from different class

		System.out.println("k value is "+k);         // calling static - data member from same class

		work();                                              // calling static - data function from same class
	}
}