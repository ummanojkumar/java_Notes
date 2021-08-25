class Sample
{
	static int a=20;
	static int b=30;
	public  void test1()
	{
		System.out.println("sample calss---> test method");
	}
}








class ObjectCreation
{
	static int a=10;
	public  void test(int a,int b)
	{
		int d=20;
		int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args)
	{
			 
			  new Sample().test1();
			  new demo6().test(1,2);
			  new Sample().test1();
			  System.out.println(new Sample().a);
			  System.out.println(new Sample().b);
			  System.out.println(new Sample().a+new Sample().b+new ObjectCreation().a*2+new Sample().a+new Sample().b);
			  System.out.println(new Sample().a* new ObjectCreation().a);
			  new Sample().test1();
			  new ObjectCreation().test(3,4);
			  new Sample().test1();
			  new ObjectCreation().test(4,5);
			  new Sample().test1();
			  new ObjectCreation().test(8,9);



	}
}