package Assigment.Aubergine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Flipkartsite {
	
	public Flipkartsite(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	WebDriver driver;
	
	By Flipkart=By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3");
	By CloseLoginPage=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
	By Search=By.xpath("//input[@name='q']");
	By Searchtab=By.xpath("//button[@class='L0Z3Pu']");
	

	public WebElement FlipkartURL()
	{
		return driver.findElement(Flipkart);
	}
    
	public WebElement Loginpopup()
	{
		return driver.findElement(CloseLoginPage);
	}
    
	public WebElement Searchfield()
	{
		return driver.findElement(Search);
	}
	
	public WebElement Searchbutton()
	{
		return driver.findElement(Searchtab);
	}

}
