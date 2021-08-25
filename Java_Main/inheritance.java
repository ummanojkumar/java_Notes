class parent
{
	 int a=21;
	 double b=45.6;

      public static  void ptest()
	{
		System.out.println("Executing static-ptest() of parent class");

	}
	public  void pview()
	{
		System.out.println("Executing non-static-pview() of parent class");
	}

}




//---------------------------------------------------------
class child extends parent
{
	int c=34;
	String str="Manoj";
	public static void ctest() 
	{
		System.out.println("Executing of ctest() of child class");
	}
	public void cview()
	{
		System.out.println("Executing of cview() of child class");
	}
}

//--------------------------------------------------------------

class child2 extends child
{
	int d=21;
	String s="king";
	public static void c2test()
	{
		System.out.println("Executing of c2test() of child2 class");

	}
	public void c2view()
	{
		System.out.println("Executing of c2view() of child2 class");
	}

}


//--------------------------------------------------------
class inheritance
{
	public static void main(String[] args) 
	{

		System.out.println("----------------super most class---------------------");
		parent p1=new parent();
		System.out.println(p1.a);
		System.out.println(p1.b);
		p1.ptest();
		p1.pview();


		System.out.println("------------------super and child class------------------------");

		child c1=new child();
		System.out.println(c1.c);
		System.out.println(c1.str);
		c1.cview();
		c1.pview();
		c1.ptest();
		p1.ptest();
		

		System.out.println("-------------------child class---------------------------------");

		child2 c2=new child2();
		System.out.println(c2.d);
		System.out.println(c2.s);
		// accesing child2 class
		c2.c2test();
		c2.c2view();
		//inheriting chlid class
		c2.ctest();
		c2.cview();
		// inheritiing parent class
		c2.ptest();
		c2.pview();
	}
}