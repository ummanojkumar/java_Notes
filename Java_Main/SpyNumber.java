import java.util.Scanner;

class SpyNumber
{

	public static void main(String[] args)
	 {
	 	System.out.println("Enter the Number: ");
	 	Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int lastDigit=0;
		int sum=0;
		
		int mul=1;
		while (num>0)
		{
			lastDigit=num%10;
			sum=sum+lastDigit;
			mul=mul*lastDigit;
			num=num/10;

		}
		if (sum==mul)
		{
		System.out.println("Enter Number is Spy Number");
		}
		else
		{
		System.out.println("Enter Number is NOT Spy Number");
		}
	}
}