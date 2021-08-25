class FindMaxMidMin
{
	public static boolean evenlySpaced(int a, int b, int c) {
 int max;
 int min;
 int mid=0;
 max=a>b?a:b;
 max=max>c?max:c;
 min=a<b?a:b;
 min=min<c?min:c;
 System.out.println("Maximum value is : "+max);  //geting maximum value


 System.out.println("Minimum value is : "+min);  // getting minum value
 
 if (a>min && a<max)
 {

   mid=a;
 }
 else if (b>min && b<max)
 {
   mid=b;
 }
 else if(c>min && c<max)
 {
   mid=c;
 }

 System.out.println("mid value is : "+mid);    // getting medium value

 return false;
}

	public static void main(String[] args) {
		boolean result;
		//System.out.println(mid);		
		result=evenlySpaced(1,2,3);
		System.out.println(result);
	}
}