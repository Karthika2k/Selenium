package week3.day2assignments;

public class RadioButton extends Button
{
	public void selectRadioButton()
	  {
	    System.out.println("Radio Button Selected");
	  }
	public static void main(String[] args) 
	{
		Elements execute = new Elements();
		execute.click();
		execute.submit();
		execute.setText("RadioButton");
	}
}
