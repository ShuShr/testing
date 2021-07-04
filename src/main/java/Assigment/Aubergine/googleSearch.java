package Assigment.Aubergine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class googleSearch {
	
	WebDriver driver;

	By Searchtab=By.xpath("//input[@class='gLFyf gsfi']");
	
	
	public googleSearch(WebDriver driver)
	{
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement Google()
	{
		return driver.findElement(Searchtab);
	}

	
	
}
