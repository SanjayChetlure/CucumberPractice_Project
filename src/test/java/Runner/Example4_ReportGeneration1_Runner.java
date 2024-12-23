package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(    
		features = {"src\\test\\resources\\Featues\\FacebookFeatureFileWithoutTD.feature"},
		glue = {"StepDefinations"},
		publish = true
		)

public class Example4_ReportGeneration1_Runner extends AbstractTestNGCucumberTests
{

}
