class Vehicle
{
	String Brand;
	String Model;
	String Year;
	public void drive()
	{
		Brand="SUZUKI";
		Model="AULTO";
		Year="2000";
	}
}
class Car extends Vehicle
{
	String Color;
	public void type()
	{
		Color="Yellow";
		System.out.println("Brand :"+Brand+"\nModel :"+Model+"\nYear :"+Year+"\nColor :"+Color);
	}
}
public class VehicleMain {

	public static void main(String[] args) {
		Car c=new Car();
		c.drive();
		c.type();

	}

}