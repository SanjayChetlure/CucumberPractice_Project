package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithoutTD1.feature"},
		glue = {"StepDefinations"}
		)


public class Example2_FacebookRunnerWithoutTD1 extends AbstractTestNGCucumberTests
{

}
