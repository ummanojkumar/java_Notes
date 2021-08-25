class callingFunction
{
	public static void findAvg(int n1,int n2,int n3) //input variables--> arguments List
	{
	   double avg;
      
      
	   avg = (n1+n2+n3)/3.0;
      
       System.out.println("avg : "+avg);
	   return;     // its is not manditory the compiler will take  take automatically (if the return type is "void")
	}
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");
	  
	  findAvg(20,30,40);
	  findAvg(10,20,30);
	  findAvg(10,30,60);
	
       
	   System.out.println("Program ends...");	
	}
}