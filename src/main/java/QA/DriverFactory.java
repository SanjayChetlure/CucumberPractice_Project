package QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory 
{
	 public static WebDriver driver;
	
	public static WebDriver initBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver= new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
		}		
		return driver;
	}
	
	public static WebDriver getDriver() 
	{
		return driver;
	}

}