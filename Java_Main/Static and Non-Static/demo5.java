class sample
{
	 int m=24;   // non-static - data member - 

	public  void test()            // non-static - function member
	{
		System.out.println("sample function programming is called sucessfully");  
		System.out.println(m);      // non-statc data member calling  from non static same class
	}
}







class demo5
{
	 double k=67.34789;  // non - static - data member

	public  void work()
		{
			System.out.println("calling function form same class");  // non-static - function member
		}
		

	public static void main(String[] args) 
	{
		
		
		System.out.println("m value is "+new sample().m);  // calling non-static - data member from different class

		new sample().test();                          // calling non-static - data function from different class


		System.out.println("------------------------------------");

		System.out.println("k value is "+new demo5().k);         // calling non static - data member from same class

		new demo5().work();                                              // calling non static - data function from same class
	}
}