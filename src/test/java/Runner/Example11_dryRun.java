package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(    
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithoutTD.feature"},
		glue = {"StepDefinations"},
		dryRun = true
		)

public class Example11_dryRun extends AbstractTestNGCucumberTests
{
	
}
