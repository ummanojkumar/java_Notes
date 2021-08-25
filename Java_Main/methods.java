class Program1
{
	public static double findAvg(int n1,int n2,int n3)//input variables--> arguments List
	{
	   double avg;//output variable
      
      //process
	   avg = (n1+n2+n3)/3.0;
       //return the output value
	   return avg;
	}
	public static void main(String[] args)
	{
	   System.out.println("Program starts...");
	  
	   double avg = 0.0;//output variable
	   avg = findAvg(20,10,5);//pass input values and store the returned o/p value
       System.out.println("avg : "+avg);//utilize returned o/p value
       
       avg = findAvg(28,15,8);//pass input values and store the returned o/p value
       System.out.println("avg : "+avg);//utilize returned o/p value
	   System.out.println("Program ends...");	
	}
}