package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src\\test\\resources\\Featues\\CampaignTags3_TagWithFeatureFile.feature"},
		glue = {"StepDefinations"},
		publish = true,
		tags = "@compaign and @sanity"
		)

public class Example8_CampaignTagsRunner5_tagWithFeatureFile extends AbstractTestNGCucumberTests
{
	

}
