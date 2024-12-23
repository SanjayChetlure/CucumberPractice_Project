package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		//features = {"src\\test\\resources\\Featues\\DataTableUsingList.feature","src\\test\\resources\\Featues\\AmazonBackgroung.feature"},
		features = "src\\test\\resources\\Featues",
		glue = {"StepDefinations"}
		)



public class Example10_ExecutionOfMultipleFeatureFiles extends AbstractTestNGCucumberTests
{

}
