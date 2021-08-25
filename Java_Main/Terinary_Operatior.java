class Terinary_Operatior
{
	public static int largest(int a,int b,int c)
	{
		int max;
		max=a>b?a:b;
		max=max>c?max:c;
		return max;
	}
	public static void main(String[] args) 
	{
		int result;
		result=largest(1,2,4);
		System.out.println(result);
	}
}