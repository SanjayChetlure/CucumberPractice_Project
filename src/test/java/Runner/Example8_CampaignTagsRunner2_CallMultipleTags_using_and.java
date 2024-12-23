package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Featues/CampaignTags2_MultipleTagsWithSameScenario.feature"},
		glue = {"StepDefinations"},
		publish = true,
		tags = " @regression and @sanity "
		)

public class Example8_CampaignTagsRunner2_CallMultipleTags_using_and extends AbstractTestNGCucumberTests
{
	

}
