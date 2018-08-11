package stepDefinitions;



import java.util.ArrayList;
import java.util.List;

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
		List<WebElement> myList=driver.findElements(By.className("listCta__item listCta__item--bgGrey"));
		List<String> all_elements_text=new ArrayList<>();
		
		for(int i=0; i<myList.size(); i++){

	        //loading text of each element in to array all_elements_text
	        all_elements_text.add(myList.get(i).getText());

	        //to print directly
	        System.out.println(myList.get(i).getText());
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
	}
	

}
