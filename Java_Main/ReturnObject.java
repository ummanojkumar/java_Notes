class Sample
{
	double z1=98.76;  // Non-Static data Member
	public void test()  // Non-Static function Member
	{
		System.out.println("this is test() of sample class");
	}
}


//-----------------------------OBJECT CREATION----------------------------------------------------------------------------------------

class Demo
{
	public static Sample getSampleObj()   // static function member
	{
		Sample s1=new Sample();
		return s1;
	}
}



//----------------------------OBJECT UTILIZATION-----------------------------------------------------------------------------------------






class ReturnObject
{
	public static void main(String[] args)   // Static function member
	{
		Sample ref1  =  Demo.getSampleObj();
		ref1.test();
	}
}