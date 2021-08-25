class assignment1{
	public static double areaOfTriangle(int base,int height)
	{
		double area;
		area=(base*height)/2;
		return area;
	}
	public static double areaOfRhombus(int d1,int d2)
	{
		double area;
		area=(d1*d2)/2;
		return area;
	}
	public static double circumferenceOfCircle(int radius)
	{
		double circumference;
		circumference=2*3.14*radius;
		return circumference;
	}
	public static double volumeOfCylinder(int radius,int height)
	{
		double volume;
		volume=3.14*radius*radius*height;
		return volume;
	}
	public static double volumeOfSphere(int radius)
	{
		double volumes;
		volumes = (4*3.14*radius*radius*radius)/3;
		return volumes;
	}

	
	public static void main(String[] args) 
	{
		double result;
		result=areaOfTriangle(2,5);
		System.out.println("area of triangle : "+result);
		double rresult;
		rresult=areaOfRhombus(3,6);
		System.out.println("area of rhombus : "+rresult);
		double circumference;
		circumference=circumferenceOfCircle(5);
		System.out.println("circumference of circle is : "+circumference);
		double volume;
		volume=volumeOfCylinder(3,6);
		System.out.println("volume of cylinder : "+volume);
		double volumes;
		volumes=volumeOfSphere(6);
		System.out.println("volume of sphere : "+volumes);
	}
}