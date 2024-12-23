package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/test/resources/Featues/CampaignTags2_MultipleTagsWithSameScenario.feature"},
		glue = {"StepDefinations"},
		publish = true,
//		tags = " not (@functional or @sanity) "
		tags = " not @sanity "
		)

public class Example8_CampaignTagsRunner4_CallMultipleTags_using_not extends AbstractTestNGCucumberTests
{
	

}
