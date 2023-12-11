package week3.day2assignments;

public class CheckBoxButton extends Button
{
	public void clickCheckButton()
	  {
	    System.out.println("Check Button Clicked");
	  } 
	public static void main(String[] args) 
	{
		Elements execute = new Elements();
		execute.click();
		execute.submit();
		execute.setText("CheckBox");
	}
}
