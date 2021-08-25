
class Sample
{
	double z1=9.15;
	public void test()
	{
		System.out.println("this is test() of sample class");
	}
}

//--------------------PASSING OBJECT REFERENCE AS A METHOD ARGUMENT------------------------------------------------------------------------------------------------

// calling global reference variable from another class

class Demo
{
	public void click(Sample s1)        // declare argument s1 with class name  // we can change the reference variable
	{
		System.out.println("this is from demo class");
		s1.test();
	}
}




class PASSING_OBJECT_REFERENCE_AS_A_METHOD_ARGUMENT
{
	static Sample s1=new Sample();    // gloabal variable  (static - reference variable)


	public static void display()
	{
		System.out.println("this is display() of main class");
		s1.test();
	
	}
	public static void view()
	{
		System.out.println("this is view() of main class");
		System.out.println(s1.z1);
	}
	public static void main(String[] args) 
	{
		
		System.out.println("this is main class");
		s1.test();
		display();
		view();


		//calling demo class 
		Demo d1=new Demo();
		d1.click(s1);       ///passing argument s1

	}
}