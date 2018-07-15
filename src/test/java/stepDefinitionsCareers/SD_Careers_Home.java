package stepDefinitionsCareers;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import careerspageObjects.CareersHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepDefinitions.AbstractPageStepDefinition;

public class SD_Careers_Home extends AbstractPageStepDefinition{
	WebDriver driver = getDriver();
	CareersHomePage careersHomePage;
	
	@Given("^the \"([^\"]*)\" Social Wall will be displayed with default filters set$")
	public void the_Social_Wall_will_be_displayed_with_default_filters_set(String arg1) throws Throwable {

	}
	
	@When("^clicking on one of the \"([^\"]*)\" tiles$")
	public void clicking_on_one_of_the_tiles(String arg1) throws Throwable {

	}

	@Given("^there are more than ten tiles on the wall$")
	public void there_are_more_than_ten_tiles_on_the_wall() throws Throwable {

	}

	@When("^clicking on the Load More button$")
	public void clicking_on_the_Load_More_button() throws Throwable {

	}

	@Then("^ten more tiles will appear$")
	public void ten_more_tiles_will_appear() throws Throwable {

	}
	
	
	
	//Opening Homepage
	
	@Given("^asserts the UK Careers microsite homepage is open$")
	public void asserts_the_UK_Careers_microsite_homepage_is_open() throws Throwable {
		WebDriverWait wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.urlMatches("https://careers.linklaters.com/"));
		wait.until(ExpectedConditions.titleIs("Linklaters Careers | Home"));
	}
	
	@Given("^the user is on the Careers homepage$")
	public void the_user_is_on_the_Careers_homepage() throws Throwable {
		//driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://careers.linklaters.com/");
	}
	
	//Hero Video Player
	
	@Then("^the video hero banner will play automatically$")
	public void the_video_hero_banner_will_play_automatically() throws Throwable {
		careersHomePage = new CareersHomePage(driver);
		careersHomePage.AssertHeroVideoAutoPlay();
	}
	
	@When("^clicking pause on the video hero banner$")
	public void clicking_pause_on_the_video_hero_banner() throws Throwable {
		String videoRunTime;
		String videoRunTime2;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		videoRunTime = driver.findElement(By.xpath("//span[@class='plyr__progress']/input[@class='plyr__progress--seek']")).getAttribute("value");
		System.out.println(videoRunTime);
		//driver.findElement(By.xpath("//div[@class='plyr__controls']/button[@type='button'][@aria-label='Play'][1]")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//videoRunTime2 = driver.findElement(By.xpath("//span[@class='plyr__progress']/input[@class='plyr__progress--seek']")).getAttribute("value");
		//Assert.assertTrue(videoRunTime == videoRunTime2);	
	}

	@Then("^the video hero banner will pause$")
	public void the_video_hero_banner_will_pause() throws Throwable {

	}
	
}
