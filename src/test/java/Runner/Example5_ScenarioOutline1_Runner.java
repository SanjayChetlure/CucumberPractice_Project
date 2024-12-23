package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\ScenarioOutline.feature"},
		glue = {"StepDefinations",""},
		publish = true,
		plugin = {"pretty"}
		)
public class Example5_ScenarioOutline1_Runner extends AbstractTestNGCucumberTests
{
	

}
