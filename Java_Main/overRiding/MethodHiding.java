/* WHAT IS METHOD HIDING ?
  ANS) In subclass and superclass contains STATIC methods with same name
       and same arguments then it is called as method hiding */

// super_class
class parent
{
	public static void count(int num)   // In Method Hiding we declare Access Modifer as STATIC
	{
		System.out.println("Executing count() from parent class");
		for (int x=1;x<=num;x++)
		{
			
			System.out.println(x);
		}
	}
}


//sub_class    
class child extends parent                // inheritinng from parent class is manditory in overriding
{
	                                     //  @Override  we dont write override annotation in Method Hiding
	public static void count(int num)   // In Method Hiding we declare Access Modifer as STATIC
	{
		System.out.println("Executing count() from child class");
		for (int x=num;x>=1;x--)
		{

			System.out.println(x);
		}
		
	}
}

class MethodHiding
{
	public static void main(String[] args) 
	{
		parent p=new parent();
		p.count(5);

		child c=new child();
		c.count(5);

	}
}