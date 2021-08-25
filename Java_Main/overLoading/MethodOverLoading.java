class MethodOverLoading
{
	public void drawGraph()
	{
		System.out.println("point is drawn between 0,0");
	}
	public void drawGraph(int a,int b)  // no. of arguments are different
	{
		System.out.println("point is drawn between "+a+","+b);
	}
	public void drawGraph(double a,double b)  // data type of arguments are different
	{
		System.out.println("point is drawn between "+a+","+b);
	}
	public void drawGraph(int a,double b)    // data type of arguments are different
	{
		System.out.println("point is drawn between "+a+","+b);
	}
	protected static int drawGraph(double a,int b)    // order of arguments are different    with different (access specifer,acces modifer,return type)
	{
		System.out.println("point is drawn between "+a+","+b);
		return 0;
	}
	public static void main(String[] args) 
	{
		MethodOverLoading draw=new MethodOverLoading();
		draw.drawGraph();
		draw.drawGraph(1,2);
		draw.drawGraph(1.24,3.45);
		draw.drawGraph(2,2.34);
		draw.drawGraph(3.67,6);
	}
}