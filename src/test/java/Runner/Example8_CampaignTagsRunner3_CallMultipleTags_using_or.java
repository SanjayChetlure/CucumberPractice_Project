package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Featues/CampaignTags2_MultipleTagsWithSameScenario.feature"},
		glue = {"StepDefinations"},
		publish = true,
		tags = " @functional or @sanity "
		)

public class Example8_CampaignTagsRunner3_CallMultipleTags_using_or extends AbstractTestNGCucumberTests
{
	

}
