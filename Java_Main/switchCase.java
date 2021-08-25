class switchCase {
	public static void quiz(char option)
	{
		switch(option)          // switch case is not 
		{
			case 'A' : System.out.println("Option A is selected");
			        	break;
			case 'B' : System.out.println("Option B is selected");
						break;
			case 'C' : System.out.println("Option C is selected");
						break;
			case 'D' : System.out.println("Option D is selected");
						break;
			default : System.out.println("Error !! Invalid Option");
		}
	}
	public static void main(String[] args) {
		quiz('A');
		quiz('D');
		quiz('T');
		quiz('Q');
		
	}
}