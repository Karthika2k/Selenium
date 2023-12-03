package week2.day2;

public class Palindrome 
{

	public static void main(String[] args) 
	{
	  int inputOrigin= 12345;
	  String input=Integer.toString(inputOrigin);
	  String output="";
	  for (int i = input.length()-1; i >=0; i--) 
	  {
		output=output+input.charAt(i);  
	  }	
	    if(input.equals(output)) 
	    {
		 System.out.println("Palindrome"); 
	    }
	    else
	    {
	      System.out.println("Not a Palindrome");	
	    }
	}
}
