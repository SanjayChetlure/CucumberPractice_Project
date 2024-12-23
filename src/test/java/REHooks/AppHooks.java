package REHooks;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import QA.DriverFactory;
import Utility.configLoader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks 
{
	WebDriver driver;

	
	@Before
	public void launchBrowser() throws IOException
	{
		String configBrowser = configLoader.readPFData("Browser");
		String clibrowser = System.getProperty("clibrowser");
		if(clibrowser!=null)
		{
			configBrowser=clibrowser;
		}
		
		driver=DriverFactory.initBrowser(configBrowser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After(order = 2)
	public void tearDown(Scenario sce)
	{
		if(sce.isFailed())
		{
			String sceName = sce.getName();
			sceName=sceName.replace(" ", " ");
			byte[] src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			sce.attach(src, "image/png", sceName);
		}
	}
	
	@After(order = 1)
	public void closeBrowser()
	{
		driver.quit();
	}

}
