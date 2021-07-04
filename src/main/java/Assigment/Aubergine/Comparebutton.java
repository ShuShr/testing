package Assigment.Aubergine;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Comparebutton {
	
	public Comparebutton(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	WebDriver driver;
	
	By price2= By.xpath("//*[@id='fk-compare-page']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/div/div[1]");
    By price3= By.xpath("//*[@id='fk-compare-page']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[3]/div/div/div[1]");
    By price6= By.xpath("//*[@id='fk-compare-page']/div/div/div/div[1]/div[2]/div/div[1]/div[2]/div[4]/div/div/div[1]");
    
    By Addtocart2= By.xpath("//*[@id='fk-compare-page']/div/div/div/div[2]/div[3]/div[5]/div[2]/button");
    By Addtocart3=By.xpath("//*[@id='fk-compare-page']/div/div/div/div[2]/div[3]/div[5]/div[3]/button");
    By Addtocart6=By.xpath("//*[@id='fk-compare-page']/div/div/div/div[2]/div[3]/div[5]/div[4]/button");

    

	public WebElement Itemprice2()
    {
    	return driver.findElement(price2);
    	
    }
    
    public WebElement Itemprice3()
    {
    	return driver.findElement(price3);
    }
    
    public WebElement Itemprice6()
    {
    	return driver.findElement(price6);
    }
    
    public WebElement AddtoCartitem2()
    {
    	return driver.findElement(Addtocart2);
    }
    
    public WebElement AddtoCartitem3()
    {
    	return driver.findElement(Addtocart3);
    }
    
    public WebElement AddtoCartitem6()
    {
    	return driver.findElement(Addtocart6);
    }

}
