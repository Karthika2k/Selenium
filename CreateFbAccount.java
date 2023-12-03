package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateFbAccount 
{ public static void main(String[] args)
  
  {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
    driver.findElement(By.linkText("Create new account")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.name("firstname")).sendKeys("Kay");
    driver.findElement(By.name("lastname")).sendKeys("Kay");
    driver.findElement(By.name("reg_email__")).sendKeys("kaykay@gmail.com");
    driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kaykay@gmail.com");
    driver.findElement(By.id("password_step_input")).sendKeys("kaY12345#");
    WebElement day = driver.findElement(By.id("day"));
    Select drop1 = new Select(day);
    drop1.selectByValue("1");
    WebElement month = driver.findElement(By.id("month"));
    Select drop2 = new Select(month);
    drop2.selectByValue("12");
    WebElement year = driver.findElement(By.id("year"));
    Select drop3 = new Select(year);
    drop3.selectByValue("2000");
    driver.findElement(By.className("_58mt")).click();
    driver.findElement(By.name("websubmit")).click();
    driver.close();
  }
}