class arrayReverse{

	public static void reverse(int arr[])
	{
		for (int index=arr.length-1;index>=0;index--)
		{
			System.out.println(arr[index]);
		}
		System.out.println("---------------");
	}
	public static void main(String[] args) 
	{
		int a1[]={1,2,3,4,5,6};
		int a2[]={5,7,9,33,44,589};
		reverse(a1);
		reverse(a2);
	}
}