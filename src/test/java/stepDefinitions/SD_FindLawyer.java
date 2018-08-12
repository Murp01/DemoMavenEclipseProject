package stepDefinitions;




import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import pageObjects.FindLawyerPOM;

public class SD_FindLawyer extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	FindLawyerPOM findLawyer;
	
	
	@Given("^asserts all returned profiles names contain the word \"([^\"]*)\"$")
	public void asserts_all_returned_profiles_names_contain_the_word(String arg1) throws Throwable {
		//also need to check if there is a load more button
		List<WebElement> returnProfile = driver.findElements(By.cssSelector("span[class='listCta__subtitle listCta__subtitle--top ellipsis']"));
		if(returnProfile.size() >0){
			for (int i = 0; i <returnProfile.size(); i++){			
				if(returnProfile.get(i).isDisplayed()==true){	
					System.out.println(returnProfile.get(i).getText());
					Assert.assertTrue(returnProfile.get(i).getText().contains(arg1));	
				}
			}
		}
		else{
			System.out.println("There are no names that match the search term " + arg1 + ".");
		}
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
	
	@Given("^Types \"([^\"]*)\" into the name input field$")
	public void types_into_the_name_input_field(String names) throws Throwable {
		FindLawyerPOM findLawyer = new FindLawyerPOM(driver);
		findLawyer.TypeInInputName(names);
		Thread.sleep(5000);
	}
	

}
