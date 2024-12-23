package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(    
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithoutTD.feature"},
		glue = {"StepDefinations","Hooks"}
		)

public class Example7_Hooks_Runner extends AbstractTestNGCucumberTests
{
	
}
