package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\DataTableUsingMap.feature"},
		glue = {"StepDefinations"},
		publish = true,
		plugin = {"pretty"}
		
		)



public class Example6_DataTable2_UsingMapRunner extends AbstractTestNGCucumberTests
{

}