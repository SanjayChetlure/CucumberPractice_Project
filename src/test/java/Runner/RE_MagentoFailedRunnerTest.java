package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//		features = {"src\\test\\resources\\RE_Features"},
		features = {"@target/failedrun.txt"},
		glue = {"StepDefinations","REHooks"},
		plugin = {"pretty","html:target/cucumber-reports/reports.html",
				"rerun:target/failedrun.txt"}
		
		)

public class RE_MagentoFailedRunnerTest extends AbstractTestNGCucumberTests
{
	
  
}
