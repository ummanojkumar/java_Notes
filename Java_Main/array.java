class array{
	public static void main(String[] args) 
	{
		int arr[]=new int[6];          // or int[ ] arr=new int[6];
		System.out.println(arr[0]);    // default value of datatype
		arr[0]=12;					   // write or insert the data to index[0]
		System.out.println(arr[0]);
		arr[0]=222;					   // update the data 
		System.out.println(arr[0]);
		System.out.println(arr);       // get location of array

	


		System.out.println("--------------");


		int arr2[]={10,20,30,40,50};         // static  allocation of array, it takes size automatically
		

		for (int index=0; index<=arr2.length-1;index++)    // print all data in array
		{
			System.out.println(arr2[index]);
		}

		System.out.println("-------------------");

		for (int index=0;index<=arr2.length-1;index++)    // code for update or modify
		{
			if (arr2[index]>=30)
			{
				arr2[index]=0;
			}
			System.out.println(arr2[index]);
		}

	}
}