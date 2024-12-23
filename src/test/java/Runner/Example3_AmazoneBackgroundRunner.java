package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\AmazonBackgroung.feature"},
		glue = {"StepDefinations"},
		publish = true
		)

public class Example3_AmazoneBackgroundRunner extends AbstractTestNGCucumberTests
{

}
