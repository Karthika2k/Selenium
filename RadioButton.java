package week2.day4assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton 
{
	public static void main(String[] args) 
    {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/radio.xhtml");
	driver.manage().window().maximize();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.xpath("//label[text()='Chrome']")).click();
	driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
	driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();		
	boolean buttonIsSelected = driver.findElement(By.xpath("//label[text()='Bengaluru']")).isSelected();
	if(buttonIsSelected==true)
	{
		System.out.println("the button is deselected " +buttonIsSelected);
	}
	else
		System.out.println("the button is selected");
	
	boolean chromeSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Chrome']"))).isSelected();
	boolean firefoxSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Firefox']"))).isSelected();
	boolean safariSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Safari']"))).isSelected();
	boolean edgeSelected = driver.findElement((By.xpath("//h5[contains(text(),'default select')]//following::label[text()='Edge']"))).isSelected();
	if(chromeSelected==true)
	{
		System.out.println("By default chrome is selected");
	}
	else if(firefoxSelected==true)
	{
		System.out.println("By default firefox is selected");
	}
	else if(safariSelected==true)
	{
		System.out.println("By default safari is selected");
	}
	else if(edgeSelected==true)
	{
		System.out.println("By default edge is selected");
	}
	
	boolean years1to20 = driver.findElement(By.xpath("//label[text()='1-20 Years']")).isSelected();
	boolean years21to40 = driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
	boolean years41to60 = driver.findElement(By.xpath("//label[text()='41-60 Years']")).isSelected();
	if(years41to60 == true)
	{
		System.out.println("41-60 yrs is already selected");
	}
	else if(years41to60 == false)
	{
		driver.findElement(By.xpath("//label[text()='41-60 Years']")).click();
		System.out.println("41-60 yrs is clicked");
	}
	if(years21to40==true)
	{
		System.out.println("21-40 yrs is already selected");
	}
	else if(years21to40==false)
	{
		driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();
		System.out.println("21-40 yrs is clicked");
	}
	if(years1to20 == true)
	{
		System.out.println("1-20 yrs is already selected");
	}
	else if (years1to20 == false)
	{
		driver.findElement(By.xpath("//label[text()='1-20 Years']")).click();
		System.out.println("1-20 yrs is clicked");
	}
	driver.close();
    }
}
