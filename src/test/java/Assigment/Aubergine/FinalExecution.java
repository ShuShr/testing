package Assigment.Aubergine;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FinalExecution extends Browsers {
	
	@Test
	public void AccessURL() throws IOException
	{
		driver=Browserinvoke();
		driver.get("https://www.google.com/");
		
		//All items while typing flipkart in google search
		googleSearch gs=new googleSearch(driver);
		gs.Google().sendKeys("Flipkart");
	
		
		List <WebElement> List=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
        System.out.println(	List.size());
       
		for(int i=0;i<List.size();i++)
		{
		String Listitems=List.get(i).getText();
		System.out.println(Listitems);
		}
		
		for(int j=0;j<List.size();j++)
		{
			String Allitems=List.get(j).getText();
			if(Allitems.contains("flipkart"))
			{
			List.get(j).click();
			break;
			}
			}
		
		//closing login pop up
		Flipkartsite fs=new Flipkartsite(driver);
		fs.FlipkartURL().click();
		fs.Loginpopup().click();
		fs.Searchfield().sendKeys("Air Conditioner");
		fs.Searchbutton().click();
		
		//Add 2nd ,3rd and 6th items
    Airconditioner AC= new Airconditioner(driver);
    AC.Airconditioner2().click();
    AC.Airconditioner3().click();
    AC.Airconditioner6().click();
    
	//Compare button
	driver.findElement(By.xpath("//*[@id='container']/div/div[4]/div/a/span/span")).click();
	
	System.out.println("ONIDA 1.5 Ton 5 Star Split Dual Inverter AC  - White");
	System.out.println("CARRIER 1 Ton 3 Star Split AC  - White");
	System.out.println("CARRIER 1.5 Ton 3 Star Split AC  - White");
	
	Comparebutton cb=new Comparebutton(driver);
	System.out.println(cb.Itemprice2().getText());
	System.out.println(cb.Itemprice3().getText());
	System.out.println(cb.Itemprice6().getText());
	
	cb.AddtoCartitem2().click();
	cb.AddtoCartitem3().click();
	cb.AddtoCartitem6().click();
	
	//entering the pincode and the message in console
	
	driver.findElement(By.cssSelector("input[placeholder='Enter delivery pincode']")).sendKeys("400067");
    System.out.println(driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/div[1]/div/div[2]/div/div[1]/div[2]")).getText());
	driver.close();
	}
	
	}

