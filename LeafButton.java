package week2.day4assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafButton {

	public static void main(String[] args) 
	{
	 ChromeDriver driver= new ChromeDriver();
     driver.get("https://leafground.com/button.xhtml");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     driver.findElement(By.xpath("//span[text()='Click']")).click();
     String title = driver.getTitle();
     System.out.println(title);
     driver.navigate().back();
     boolean confirmButton = driver.findElement(By.xpath("//button[@name='j_idt88:j_idt92']")).isEnabled();
     if(confirmButton==false)
     {
    	 System.out.println("Button is disabled");
     }
     else
     {
    	 System.out.println("Button is enabled");
     }
     Point submitLocation = driver.findElement(By.xpath("(//button[@id='j_idt88:j_idt94']/span)[2]")).getLocation();
     System.out.println(submitLocation);
     String savecolor = driver.findElement(By.xpath("(//div[@class='card']//span)[6]")).getCssValue("color");
     System.out.println(savecolor);
     Dimension size = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize();
     System.out.println(size);
     driver.close();
	}
}
