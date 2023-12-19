package week5.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeaftapsMerge 
{
	public static void main(String[] args) throws IOException 
	{
		 ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/login");	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println(driver.getTitle());
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Merge Leads")).click();
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			String windowHandle = driver.getWindowHandle();
	        System.out.println(windowHandle);
	        Set<String> windowHandles = driver.getWindowHandles();
	        List<String> lstWindow =new ArrayList<String>(windowHandles);
	        driver.switchTo().window(lstWindow.get(1));
	        System.out.println(driver.getTitle());
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
			driver.switchTo().window(lstWindow.get(0));
			System.out.println(driver.getTitle());
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
            String windowHandle1 = driver.getWindowHandle();
	        System.out.println(windowHandle1);
	        Set<String> windowHandles1 = driver.getWindowHandles();
	        List<String> lstWindow1 =new ArrayList<String>(windowHandles1);
	        driver.switchTo().window(lstWindow1.get(1));
	        System.out.println(driver.getTitle());
			driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
			driver.switchTo().window(lstWindow.get(0));
			//Take a snapshot
			File source = driver.getScreenshotAs(OutputType.FILE);
	        File desc =new File("./snap/merge.png");
	        FileUtils.copyFile(source, desc);
			System.out.println(driver.getTitle());
		    driver.findElement(By.className("buttonDangerous")).click();
		    Alert alert = driver.switchTo().alert();
		    alert.accept();
		    System.out.println(driver.getTitle());		
	}
}
