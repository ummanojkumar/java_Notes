class increment2{
	public static void main(String[] args) {
		int a,b;
		int r1,r2;
		a=20;
		b=20;
		System.out.println(a);
		r1=++a + 5;                 // r1= 21 +5 -->26
		System.out.println(r1);
		System.out.println(a);

		System.out.println();   // just for gap

		System.out.println(b);
		r2=b++ + 5;              // r2=20+5 --->25
		System.out.println(r2);
		System.out.println(b);    
	}
}