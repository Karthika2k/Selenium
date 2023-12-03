package seleniumSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount 
{
	public static void main(String[] args) 
	    {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		//verify title
		String title=driver.getTitle();
		System.out.println(title);
		//find the element Enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//find the element Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Lead
		driver.findElement(By.linkText("Leads")).click();
		//click create leads
		driver.findElement(By.linkText("Create Lead")).click();
		//find the element Enter the company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		// find the element Enter the first name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Karthika");
		// find the element Enter the last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));//ctrl+2+l
		Select drop1 = new Select(source);
		drop1.selectByIndex(3);
		WebElement automobile = driver.findElement(By.id("createLeadForm_marketingCampaignId"));//ctrl+2+l
		Select drop2 = new Select(automobile);
		drop2.selectByVisibleText("Car and Driver");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));//ctrl+2+l
		Select drop3 = new Select(ownership);
		drop3.selectByValue("OWN_CCORP");
		//click create
		driver.findElement(By.name("submitButton")).click();
		driver.close();
	    }


}
