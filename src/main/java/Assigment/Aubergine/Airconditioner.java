package Assigment.Aubergine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Airconditioner {
	
      
	public Airconditioner(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	WebDriver driver;
	
	By item2=By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[2]/div/label/span");
	By item3=By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[1]/div[2]/div/label/span");
	By item6=By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[7]/div/div/div/a/div[1]/div[2]/div/label/span");
	
	

	public WebElement Airconditioner2()
	{
		return driver.findElement(item2);
	}
	
	public WebElement Airconditioner3()
	{
		return driver.findElement(item3);
	}
	
	public WebElement Airconditioner6()
	{
		return driver.findElement(item6);
	}
	
}
