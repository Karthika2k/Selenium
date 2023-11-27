package week2.assisgnments;

public class Car
{
  void applyBreak()
  {
	System.out.println("Applied break");  
  }
  void soundHorn()
  {
	System.out.println("Sound Horn");  
  }
  public static void main(String[] args) 
  {
    Car vehicle = new Car();
    vehicle.applyBreak();
    vehicle.soundHorn();
  }
}
