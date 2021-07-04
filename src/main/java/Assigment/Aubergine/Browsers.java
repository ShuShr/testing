package Assigment.Aubergine;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsers {

	private static final TimeUnit Timeunit = null;
	WebDriver driver;
	public WebDriver Browserinvoke() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Aubergine\\data.properties");
		prop.load(fis);
		
	String Browsername	=prop.getProperty("Browser");
	
	if(Browsername.equals("Chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	else if(Browsername.equals("firefox"))
	{
		
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	return driver;
	
	
	
	
	}
}
