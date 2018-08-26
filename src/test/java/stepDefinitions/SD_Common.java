package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CommonPOM;
import pageObjects.InsightsPagePOM;

public class SD_Common extends AbstractPageStepDefinition{
	
	WebDriver driver = getDriver();
	CommonPOM common; 
	
		
	@Given("^the cookie policy banner appears$")
	public void assert_the_cookie_policy_banner_appears() throws Throwable {
		common = new CommonPOM(driver);
		common.assertTrueCookieBanner();
	}
	
	@Then("^the cookie policy banner will not be displayed$")
	public void assert_the_cookie_policy_banner_will_not_be_displayed() throws Throwable {

	}
			
	@Given("^the search input will not be open$")
	public void assert_the_search_box_will_not_be_open() throws Throwable {
		common = new CommonPOM(driver);
		common.assertFalseSearchInput();
	}
	
	@Given("^the search input will open$")
	public void assert_the_search_box_will_open() throws Throwable {
		common = new CommonPOM(driver);
		common.assertTrueSearchInput();
	}
	
	@When("^assert the print option pop up menu appears$")
	public void assert_the_print_option_pop_up_menu_appears() throws Throwable {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='modal-body']")).isEnabled());
	}
	
	@Then("^assert the print option pop up menu closes$")
	public void assert_the_print_option_pop_up_menu_closes() throws Throwable {
		Assert.assertFalse(driver.findElement(By.xpath("//div[@class='modal-body']")).isEnabled());
	}
	
	@Then("^assert the print setting window will open$")
	public void assert_the_print_setting_window_will_open() throws Throwable {
		
	}
	
	@Given("^asserts the search results generate below the site search bar$")
	public void asserts_the_search_results_generate_below_the_site_search_bar() throws Throwable {

	}
	
	@Given("^asserts the site search bar appears$")
	public void asserts_the_site_search_bar_appears() throws Throwable {
	    
	}
	
	@Then("^Assert that the url contains \"([^\"]*)\"$")
	public void assert_the_url_contains(String title) throws Throwable {
		Assert.assertTrue(driver.getTitle().contains(title));
	}
	
	@Then("^asserts the \"([^\"]*)\" page will open$")
	public void asserts_the_page_will_open(String arg1) throws Throwable {

	}
	
	@When("^clicking on the print button$")
	public void clicking_on_the_print_button() throws Throwable {
		CommonPOM common = new CommonPOM(driver);
		common.clickPrintButton();
	}
	
	@When("^clicking on \"([^\"]*)\" from the print pop up menu$")
	public void clicking_on_from_the_print_pop_up_menu(String button) throws Throwable {
		CommonPOM common = new CommonPOM(driver);
		switch(button) {
		case "PRINT WEB PAGE":
			common.clickPrintWebpageBtn();
			break;
		case "PRINT AS A PDF":
			common.clickPrintAsPDF();
			break;		
		case "CLOSE":
			common.clickPrintCloseBtn();
			break;			
		}
	}
	
	@Given("^clicks the close button on the cookie banner$")
	public void clicks_on_close_button_on_the_cookie_banner() throws Throwable {
		common = new CommonPOM(driver);
		common.clickCookieBannerCloseBtn();
	}
	
	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		common = new CommonPOM(driver);
		common.clickInsightTitle();
	}
	
	@Given("^clicks on the Blogs link from the secondary navigation$")
	public void clicks_on_the_Blogs_link_from_the_secondary_navigation() throws Throwable {

	}
		
	@Given("^clicks on the Linklaters logo$")
	public void clicks_on_the_Linklaters_logo() throws Throwable {

	}
		
	@Given("^clicks on the search toggle$")
	public void clicks_on_the_search_icon() throws Throwable {
		common = new CommonPOM(driver);
		common.clickSearchToggle();
	}
	
	@Given("^clicks on the the site search magnify button$")
	public void clicks_on_the_the_site_search_magnify_button() throws Throwable {
		common = new CommonPOM(driver);
		common.clickSearchMagnifyIcon();
	}
	
	@When("^clicks on the \"([^\"]*)\" link in the primary navigation$")
	public void clicks_on_the_link_in_the_primary_navigation(String link) throws Throwable {
		CommonPOM common = new CommonPOM(driver);
		switch(link) {		
		case "About Us":			
			System.out.println(link);
			common.clickAboutUsTitle();
			common.jsWaitforPageToLoad();
			break;
		case "Client Services":
			common.clickClientServices();
			break;
		case "Sectors":
			common.clickSectorsTitle();
			break;
		case "Find People":
			common.clickFindPeopleTitle();
			break;
		case "Locations":
			common.clickLocationsTitle();
			break;
		case "Insights":
			common.clickInsightTitle();
			break;
		case "Careers":
			common.clickCareersTitle();
			break;	
		}
	}
	
	@When("^clicks on the \"([^\"]*)\" search result$")
	public void clicks_on_the_search_result(String arg1) throws Throwable {

	}
	
	@Given("^hovers over \"([^\"]*)\" from the primary navigation$")
	public void hovers_over_from_the_primary_navigation(String title) throws Throwable {
		common = new CommonPOM(driver);
		switch(title){
		case "About Us":			
			common.mouseOverAboutUsTitle();
			break;
		case "Client Services":
			common.mouseOverClientServicesTitle();
			break;			
		case "Sectors":
			common.mouseOverSectorsTitle();
			break;			
		case "Find People":	
			common.mouseOverFindPeopleTitle();
			break;
		case "Locations":
			common.mouseOverLocationsTitle();
			break;			
		case "Insights":
			common.mouseOverInsightTitle();
			break;			
		case "Careers":
			common.mouseOverCareersTitle();
			break;
		}
	}
	
	@Given("^hovers over the About Us title and selects \"([^\"]*)\"$")
	public void mouse_over_the_About_Us_title_and_selects(String link) throws Throwable {
		switch(link) {
		case "Alumni":
			Actions action = new Actions(driver);
			action.moveToElement(driver.findElement(By.xpath("//div[@class='header__navDesktop']/ul/li/a[@href='/en/about-us']"))).click().build().perform();
			driver.findElement(By.xpath("//li/a[@href='/en/about-us/alumni']")).click();  //not finding correct link
			break;
		case "At a glance":
			driver.findElement(By.xpath("//a[@href='/en/client-services'][1]")).click();
			break;
		case "Contact Us":
			driver.findElement(By.xpath("//a[@href='/en/sectors'][1]")).click();
			break;
		case "Executive Committee":
			driver.findElement(By.xpath("//a[@href='/en/find-a-lawyer'][1]")).click();
			break;
		case "Innovation":
			driver.findElement(By.xpath("//a[@href='/en/locations'][1]")).click();
			break;
		case "News and Deals":
			driver.findElement(By.xpath("//a[@href='/en/insights'][1]")).click();
			break;
		case "Responsibility":
			driver.findElement(By.xpath("//a[@href='/en/careers'][1]")).click();
			break;	
		}
	}
	
	@Given("^hovers over the Insights title$")
	public void mouse_over_the_Insights_title() throws Throwable {
		common = new CommonPOM(driver);
	    common.mouseOverInsightTitle();
	}
	
	@Given("^hovers over the insights title and selects publications$")
	public void mouse_over_the_insights_title_and_selects_publications() throws Throwable {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a"))).click().build().perform();
		driver.findElement(By.xpath("/html/body/nav/div/div[6]/ul[3]/li/a")).click();
	}
	
	@Given("^types \"([^\"]*)\" into the site search bar$")
	public void types_into_the_site_search_bar(String searchTerm) throws Throwable {
		common = new CommonPOM(driver);
		common.sendKeysSearchInput(searchTerm);
	}
	

}
