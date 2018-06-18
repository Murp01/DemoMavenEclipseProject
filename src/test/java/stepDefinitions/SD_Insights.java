package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.When;
import pageObjects.InsightsPage;

public class SD_Insights extends AbstractPageStepDefinition {
	//private static WebDriver driver;
	WebDriver driver = getDriver();
	InsightsPage insightsPage;

	@When("^the user enters a search term into the Insights Keywords field$")
	public void the_user_enters_a_search_term_into_the_Insights_Keywords_field() throws Throwable {
		insightsPage = new InsightsPage(driver);
		insightsPage.clickClearInsightKeywordBox();
		insightsPage.insight_KeywordEnterText("Paul");	
	}

}
