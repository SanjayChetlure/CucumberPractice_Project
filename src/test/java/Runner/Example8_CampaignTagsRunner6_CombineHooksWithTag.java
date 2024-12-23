package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\CompaignTags1.feature"},
		glue = {"StepDefinations","Hooks1"},
		publish = true,
		tags = "@regression or @sanity"
		)

public class Example8_CampaignTagsRunner6_CombineHooksWithTag extends AbstractTestNGCucumberTests
{
	

}
