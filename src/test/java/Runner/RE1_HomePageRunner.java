package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"D:\\Batches\\workspace\\DemoCucumberProject\\src\\test\\resources\\RE_Features\\RE1_HomePageFunctionality.feature"},
		glue = {"StepDefinations","REHooks"}
		
		)

public class RE1_HomePageRunner extends AbstractTestNGCucumberTests
{
	

}
