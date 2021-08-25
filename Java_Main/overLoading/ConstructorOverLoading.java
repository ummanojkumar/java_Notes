class ConstructorOverLoading
{
	public ConstructorOverLoading()
	{
		System.out.println("this is zero-argument constructor of ConstructorOverLoading class");
	}
	public ConstructorOverLoading(int a)
	{
		System.out.println("this is ConstructorOverLoading(int a) constructor of ConstructorOverLoading class");
	}
	public ConstructorOverLoading(int a,int b)
	{
		System.out.println("this is ConstructorOverLoading(int a,int b) constructor of ConstructorOverLoading class");
	}
	public ConstructorOverLoading(int a,double b)
	{
		System.out.println("this is ConstructorOverLoading(int a,double b) constructor of ConstructorOverLoading class");
	}
	public ConstructorOverLoading(double a, int b)
	{
		System.out.println("this is ConstructorOverLoading(double a, int b) constructor of ConstructorOverLoading class");
	}
	public static void main(String[] args) 
	{
		new ConstructorOverLoading();
		new ConstructorOverLoading(4);
		new ConstructorOverLoading(1,2);
		new ConstructorOverLoading(1,2.45);
		new ConstructorOverLoading(4.5,1);
		
	}
}