package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\CompaignTags1.feature"},
		glue = {"StepDefinations"},
		publish = true,
		tags = "@regression"
		)

public class Example8_CampaignTagsRunner1 extends AbstractTestNGCucumberTests
{
	

}
