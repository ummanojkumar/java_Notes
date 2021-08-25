
//superclass
class Parent extends Object   // superclass is inherited to object class
{
	public Parent(int a)
	{
		super();
		System.out.println("executing demo class constructor");
	}
}


//sub class
class Child extends Parent
{
	public Child()
	{
		super(20); // parameterized super statement
		System.out.println("executing sample class constructor");
	}
}






class SuperClass{
	public static void main(String[] args)
	 {

		new Child();
	}
}