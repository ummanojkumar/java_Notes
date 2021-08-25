class User
{
	String userName;
	String password;
	String role;
	long mobileNo;

	public void showUser()
	{
		System.out.println("userName : "+userName);
		//  System.out.println("password : "+password);
		System.out.println("role : "+role);
		System.out.println("mobileNo : "+mobileNo);
	}


}






class Airport
{
	String airportName;
	String abbreviation;
	String location;

	public void showAirport()
	{
		System.out.println("airportName : "+airportName);
		System.out.println("abbreviation : "+abbreviation);
		System.out.println("location : "+location);
	}
}






class FlightInformation
{
	String flightNo;
	String airline;
	String depCity;
	String arrCity;
	Date depDate; //date
	Date arrDate;
	String depTime;
	String arrTime;
	int firstSeats;       /// first class seats
	double firstSeatFare;   /// number(m,n)
	int bussSeats;        // business class seats 
	double bussSeatFare;     /// number(m,n)

	public void showFlightInformation()
	{
		System.out.println("flightNo : "+flightNo);
		System.out.println("airline : "+airline);
		System.out.println("depature City : "+depCity);
		System.out.println("arrival City : "+arrCity);
		System.out.println("depature Date : "+depDate);
		System.out.println("arrival Date : "+arrDate);
		System.out.println("depature Time : "+depTime);
		System.out.println("arrival Time : "+arrTime);
		System.out.println("first Class Seats : "+firstSeats);
		System.out.println("first Class SeatFare : "+firstSeatFare);
		System.out.println("bussiness class Seats : "+bussSeats);
		System.out.println("bussiness class SeatFare: "+bussSeatFare);
	}
}







class BookingInformation
{
	String bookingId;
	String custEmail;
	int noOfPassengers;
	static String firstclass="firstclass";
	static String businessclass="businessclass";
	String classType;
	double totalFare;
	int seatNumbers;
	String creditCardInfo;
	String srcCity;
	String destCity;

	public void showBookingInformation()
	{
		System.out.println("bookingId : "+bookingId);
		System.out.println("customer Email : "+custEmail);
		System.out.println("no of passagers : "+noOfPassengers);
		System.out.println("classType : "+classType);
		System.out.println("totalFare : "+totalFare);
		System.out.println("seatNumbers :"+seatNumbers);
		// System.out.println("creditCardInfo : "+creditCardInfo);
		System.out.println("source City : "+srcCity);
		System.out.println("destination City : "+destCity);
	}

}