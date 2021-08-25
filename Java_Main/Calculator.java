import java.lang.Math;

class BasicCalulator
{
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static int sub(int a,int b)
	{
		return a-b;
	}
	public static int mul(int a,int b)
	{
		return a*b;
	}
	public static double div(int a,int b)
	{
		return a/b;
	}
	public static int mod(int a,int b)
	{
		return a%b;
	}
}

class ScientificCalculator extends BasicCalulator
{
	public  double log(double value)
	{
		double res=Math.log10(value);
		return res;
	}
	public  double sin(double degree)
	{
		double radians=Math.toRadians(degree);
		double res=Math.sin(radians);
		return res;

	}
	public  double cos(double degree)
	{
		double radians=Math.toRadians(degree);
		double res=Math.cos(radians);
		return res;
	}
	public  double tan(double degree)
	{
		double radians=Math.toRadians(degree);
		double res=Math.tan(radians);
		return res;

	}
}

class ProgrammingCalculator extends BasicCalulator
{
	public  int and(int a,int b)
	{
		return a&b;
	}
	public  int or(int a, int b)
	{
		return a|b;
	}
	public  int xor(int a,int b)
	{

		return a^b;

	}
}






class Calculator
{
	public static void main(String[] args)
	 {
		BasicCalulator b=new BasicCalulator();
		ScientificCalculator s=new ScientificCalculator();
		ProgrammingCalculator p=new ProgrammingCalculator();

		System.out.println(b.add(2,3));
		System.out.println(b.sub(3,2));
		System.out.println(s.log(45));
		System.out.println(s.add(3,4));
		System.out.println(p.and(5,5));
		System.out.println(p.xor(3,4));
		
	}
}