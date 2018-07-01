package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class SD_Homepage extends AbstractPageStepDefinition {
	
	WebDriver driver = getDriver();
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
		//driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.linklaters.com/");
	}
	
	@Given("^the first tab of the banner widget is selected by default$")
	public void the_first_tab_of_the_banner_widget_is_selected_by_default() throws Throwable {

	}
	
	@Given("^clicks on the \"([^\"]*)\" tab of the banner widget is selected$")
	public void clicks_on_the_tab_of_the_banner_widget_is_selected(String arg1) throws Throwable {

	}

	@Given("^the Linklaters homepage will open$")
	public void the_Linklaters_homepage_will_open() throws Throwable {

	}
	
	@Given("^the homepage article widget is displayed$")
	public void the_homepage_article_widget_is_displayed() throws Throwable {

	}

	@When("^clicking on the homepage article widget load more button$")
	public void clicking_on_the_homepage_article_widget_load_more_button() throws Throwable {

	}
	
	@Given("^clicks on the \"([^\"]*)\" article of the homepage article widget$")
	public void clicks_on_the_article_of_the_homepage_article_widget(String arg1) throws Throwable {

	}
	
	@Given("^\"([^\"]*)\" more articles will be displayed on the homepage article widget$")
	public void more_articles_will_be_displayed_on_the_homepage_article_widget(String arg1) throws Throwable {

	}
	
	@Given("^the Linklaters banner is displayed$")
	public void the_Linklaters_banner_is_displayed() throws Throwable {

	}

	@Given("^clicks on the \"([^\"]*)\" link on the Linklaters banner$")
	public void clicks_on_the_link_on_the_Linklaters_banner(String arg1) throws Throwable {

	}


}
