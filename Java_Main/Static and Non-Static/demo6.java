class Sample
{
	static int x1=45;   ///static 
	       double y1=98.45;   // non-static 

	public static void staticcall()
	{
		 System.out.println("this is staticcall() from sample class");

		 int x1=650;

		 System.out.println("local variable = "+x1);
		 System.out.println("gloabal variable = "+Sample.x1);
		 System.out.println();
	}

	public void nonstaticcall( )
	{
		System.out.println("this is nonstaticcall from sample");

		double y1=45.67;
		System.out.println("local variable = "+y1);
		System.out.println("gloabal variable = "+this.y1);     //     or      System.out.println(new Sample() .y1);
		
	}

}







class demo6
{

	public static void main(String[] args) 
	{
		Sample.staticcall();



		new Sample().nonstaticcall();
	}
}