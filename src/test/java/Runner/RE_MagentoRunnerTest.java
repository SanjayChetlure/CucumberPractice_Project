package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\RE_Features"},
		glue = {"StepDefinations","REHooks"},
		plugin = {"pretty","html:targer/cucumber-reports/reports.html"}
		
		)

public class RE_MagentoRunnerTest extends AbstractTestNGCucumberTests
{
	

}
