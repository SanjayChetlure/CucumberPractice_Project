package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\RE_Features"},
		glue = {"StepDefinations","REHooks"},
		plugin = {"pretty","html:target/cucumber-reports/reports.html",
				"rerun:target/failedrun.txt"},
		
		tags = "@regression"
		
		)

public class RE_MagentoRunnerTest1 extends AbstractTestNGCucumberTests
{
	
  
	
}
