package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(    
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithoutTD.feature"},
		glue = {"StepDefinations"}
		)

public class Example12_PropertyFile extends AbstractTestNGCucumberTests
{
	
}