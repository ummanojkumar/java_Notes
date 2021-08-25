class Car
{
  private String carName;
  private double cost;
  private String material;
  private int numberOfSeats;
  private Engine eng;

  public Car(String carName,double cost,String material,int numberOfSeats)
  {
  	this.carName=carName;
  	this.cost=cost;
  	this.material=material;
  	this.numberOfSeats=numberOfSeats;
  }

  public String getcarName()
  {
  	return carName;
  }
  public double getCost()
  {

  	return cost;
  }
  public int getNumberOfSeats()
  {
  	return numberOfSeats;
  }
  public Engine getEng()
  {
  	return eng;
  }
  public void setEng(Engine eng)
  {
  	this.eng=eng;
  }

  

}


//------------------------------------------------------------------------------


class Engine
{
	private String material;
	private String company;
	private String capacity;
	private String mileage;

	public Engine(String material,String company,String capacity,String mileage)
	{
		this.material=material;
		this.company=company;
		this.capacity=capacity;
		this.mileage=mileage;

	}

	public String getCompany()
	{
		return company;
	}
	public String getMileage()
	{
		return mileage;
	}





}

//------------------------------------------------------------------------------------------------

class CarAndEngine
{
	public static void main(String[] args) 
	{
		Car c1=new Car("Toyota",200000,"iron",6);
		Engine e1=new Engine("iron","Toyota","500CC","100 KMPH");
		c1.setEng(e1);
		System.out.println(c1.getEng().getCompany());
		System.out.println(c1.getEng().getMileage());
		//System.out.println(e1.getCompany());


		
	}
}