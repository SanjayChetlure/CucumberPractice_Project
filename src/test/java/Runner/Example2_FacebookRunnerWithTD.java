package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithTD.feature"},
		glue = {"StepDefinations"}
		)


public class Example2_FacebookRunnerWithTD extends AbstractTestNGCucumberTests
{

}
