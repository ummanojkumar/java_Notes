class logicalOpearator{
	public static void main(String[] args) 
	{
		int a,b,c;
		a=10;
		b=5;
		c=2;
		System.out.println("logical AND operator");
		System.out.println(a>b && a>c);
		System.out.println(a>b && a<c);
		System.out.println(a<b && a>c);
		System.out.println(a<b && a<c);
		System.out.println("logical OR operator");
		System.out.println(a>b || a>c);
		System.out.println(a>b || a<c);
		System.out.println(a<b || a>c);
		System.out.println(a<b || a<c);
		System.out.println("logical XOR operator");
		System.out.println(a>b ^ a>c);
		System.out.println(a>b ^ a<c);
		System.out.println(a<b ^ a>c);
		System.out.println(a<b ^ a<c);




		
	}
}