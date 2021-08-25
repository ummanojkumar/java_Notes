import java.util.Scanner;
class input{
	public static void main(String[] args) {
		System.out.println("enter the values: ");
		Scanner input=new Scanner(System.in);

		// code is for understanding purpose 
		
		byte b=input.nextByte();  // read byte value

		short s=input.nextShort(); // read short value

		int n=input.nextInt();    // read int value

		long l=input.nextLong();   // read long vlaue

		float f=input.nextFloat(); // read float value

		double d=input.nextDouble();  // read double value

		boolean bool=input.nextBoolean();  // read boolean value

		String oneword=input.next();   // read string of only one word

		String multiplewords=input.nextLine();  // read full string or sentence

		char ch=input.next().charAt(0);        // read character

		char ch2=input.next().charAt(1);       // read character in a string of index[1]

		System.out.println(b);
	}
}