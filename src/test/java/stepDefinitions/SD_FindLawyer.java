package stepDefinitions;




import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.FindLawyerPOM;

public class SD_FindLawyer extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	FindLawyerPOM findLawyer;
	
	@Then("^asserts a message is displayed stating the search retrieved no results$")
	public void asserts_a_message_is_displayed_stating_the_search_retrieved_no_results() throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		findLawyer.assertNoReturnResultsText();
	}
	
	@Given("^asserts all returned profiles names contain the word \"([^\"]*)\"$")
	public void asserts_all_returned_profiles_names_contain_the_word(String profileName) throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		findLawyer.clickEachLoadMoreOccurance();
		//findLawyer.assertAllReturnResultsContain(profileName);
		List<WebElement> returnProfile = driver.findElements(By.cssSelector("span[class='listCta__subtitle listCta__subtitle--top ellipsis']"));
		if(returnProfile.size() >0){
			for (int i = 0; i <returnProfile.size(); i++){			
				if(returnProfile.get(i).isDisplayed()==true){	
					System.out.println(returnProfile.get(i).getText());
					Assert.assertTrue(returnProfile.get(i).getText().contains(profileName));	
				}
			}
		}
		else{
			System.out.println("There are no names that match the search term " + profileName + ".");
		}
	}
	
	@Given("^clicks on each occurance of the Load More button$")
	public void clicks_on_each_occurance_of_the_Load_More_button() throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		findLawyer.clickEachLoadMoreOccurance();
	}
	
	@Given("^clicks on the \"([^\"]*)\" from the Team Selector$")
	public void clicks_on_the_from_the_Team_Selector(String teamSel) throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		switch(teamSel){
		case "Business Teams":
			findLawyer.clickSelBusinessTeam();
			break;
		case "Lawyer Directory":
			findLawyer.clickSelLawyerDir();
			break;
		
		}
	}
	
	@Given("^then asserts all returned profiles names contain the word \"([^\"]*)\"$")
	public void then_asserts_all_returned_profiles_names_contain_the_word(String profileName) throws Throwable {
		List<WebElement> returnProfile = driver.findElements(By.cssSelector("span[class='listCta__subtitle listCta__subtitle--top ellipsis']"));
		if(returnProfile.size() >0){
			for (int i = 0; i <returnProfile.size(); i++){			
				if(returnProfile.get(i).isDisplayed()==true){	
					System.out.println(returnProfile.get(i).getText());
					Assert.assertTrue(returnProfile.get(i).getText().contains(profileName));	
				}
			}
		}
		else{
			System.out.println("There are no names that match the search term " + profileName + ".");
		}
	}
	
	@Given("^Types \"([^\"]*)\" into the name input field$")
	public void types_into_the_name_input_field(String names) throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		findLawyer.TypeInInputName(names);
		Thread.sleep(5000);
	}
	

}
