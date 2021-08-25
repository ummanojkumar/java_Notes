class amstrong{
	public static int ams(int num)
	{	int lastdigit;
		int sum=0;
		int temp=num;
		while (num>0)
		{
			lastdigit=num%10;
			sum=sum+(lastdigit*lastdigit*lastdigit);
			num=num/10;
		}
		if (temp==sum){
			System.out.println("number is amstrong");
		}
		else{
			System.out.println("number is not a amstrong");
		}
		return 0;
	}
	public static void main(String[] args) {
		int result;
		result=ams(153);
		
	}
}