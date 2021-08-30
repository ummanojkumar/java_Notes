// super_class
class parent
{
	public void count(int num)          // In Method overRiding we declare Access Modifer as NON-STATIC
	{
		System.out.println("Executing count() from parent class");
		for (int x=1;x<=num;x++)
		{
			
			System.out.println(x);
		}
	}
}


//sub_class
class child extends parent         // inheritinng from parent class is manditory in overriding
{
    @Override               // override annotation (@--> Annotation)
	public 
	void count(int num)     // In Method overRiding we declare Access Modifer as NON-STATIC
	{
		System.out.println("Executing count() from child class");
		for (int x=num;x>=1;x--)
		{

			System.out.println(x);
		}
		
	}
}

class MethodOverRiding
{
	public static void main(String[] args) 
	{
		parent p=new parent();
		p.count(3);

		child c=new child();
		c.count(3);

	}
}