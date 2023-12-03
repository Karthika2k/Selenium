package week2.day2;


public class ChangeOddUppercase 
{

	public static void main(String[] args) 
	{
	  String input="changeme";
      char[] charArray=input.toCharArray();
      for (int i = 0; i < charArray.length; i++) 
      {
        if(i%2!=0)
        {
		System.out.println(Character.toUpperCase(charArray[i]));
        }
        else
        {
        	System.out.println(charArray[i]);
        }
      }
	}


}
