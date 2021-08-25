class LowerMiddleUpperSame{
	public static boolean compareThreeBoundaries(int arr[])
	{
		int lb=0;
		int ub=arr.length-1;
		int mb=ub/2;
		if (arr[lb]==arr[mb] && arr[lb]==arr[ub]){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		int a1[]={1,2,1,4,5,1};
		boolean result=compareThreeBoundaries(a1);
		System.out.println(result);
	}
}