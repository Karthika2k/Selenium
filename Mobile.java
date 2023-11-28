package week2.assisgnments;

public class Mobile 
{
	public void makeCall(String mobileModel,float mobileWeight)
	  {
		  System.out.println(mobileModel);
		  System.out.println(mobileWeight +" grams");
	  }
	  void sendMsg(boolean isFullCharged, int mobileCost)
	  {
		  System.out.println(isFullCharged);
		  System.out.println(mobileCost);
	  }
	  public static void main(String[] args) 
	  {
		System.out.println("This is my Mobile");
		Mobile mob = new Mobile();
		mob.makeCall("Samsung Galaxy Z",253.0f);
		mob.sendMsg(true,154999);
	  }
}
