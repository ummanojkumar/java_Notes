class parent
{
	int v1=25;

}
class child extends parent
{
	double v1=56.987;
	public void test()
	{
		System.out.println("executing test() of child class");

		System.out.println("v1 "+v1);
		System.out.println("v1 "+super.v1);
	}


}
class SuperKeyword
{
	public static void main(String[] args) 
	{
		child c=new child();
		c.test();
	}
}