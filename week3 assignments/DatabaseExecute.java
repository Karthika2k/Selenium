package week3.day3assignments;

public class DatabaseExecute implements DatabaseInterface
{

	public void connect() 
	{
      System.out.println("Connected");	
	}

	public void disconnect() 
	{
      System.out.println("Disconnected");
	}

	public void executeUpdate() 
	{
      System.out.println("Updated");
	}
    public static void main(String[] args) 
    {
	 DatabaseExecute execute=new DatabaseExecute();
	 execute.connect();
	 execute.disconnect();
	 execute.executeUpdate();
	}
}
