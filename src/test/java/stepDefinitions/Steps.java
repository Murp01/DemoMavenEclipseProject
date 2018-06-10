package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private static WebDriver driver;
	
	@Given("^the user is on the homepage$")
	public void the_user_is_on_the_homepage() throws Throwable {
		driver = new FirefoxDriver();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		driver.get("https://www.linklaters.com/");
	}

	@Given("^clicks on Insights on the title header$")
	public void clicks_on_Insights_on_the_title_header() throws Throwable {
		driver.findElement(By.xpath("/html/body/header/div/div/div/ul/li[6]/a")).click();
	}

	@When("^the user enters a search term into the Insights Keywords field$")
	public void the_user_enters_a_search_term_into_the_Insights_Keywords_field() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div/div/div[1]/div/div[1]/div[1]/input")).sendKeys("Paul");
	}

	@When("^filtered Insights articles appear$")
	public void filtered_Insights_articles_appear() throws Throwable {
		System.out.println("Hello Insights article appears");
	}

	@When("^clicks Read More on Insights article$")
	public void clicks_Read_More_on_Insights_article() throws Throwable {
		System.out.println("Hello click on Read More");
	}

	@Then("^Insight article detail page opens$")
	public void insight_article_detail_page_opens() throws Throwable {
		System.out.println("Hello Articles detail page");
		driver.quit();
	}

}
