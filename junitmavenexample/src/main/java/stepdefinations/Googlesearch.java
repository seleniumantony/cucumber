package stepdefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Googlesearch {
	
	private WebDriver driver;
	@Given("^user is  on homepage$")
	public void user_is_on_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\antonyj\\git\\practice\\JesusMaryJoseph\\src\\main\\resources\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();						 
				 
driver.manage().window().maximize();
driver.get("https://www.google.com/");
	  System.out.println("Home page launched");
	  Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}

	@When("^user navigates to Login Page$")
	public void user_navigates_to_Login_Page() throws Throwable {
		System.out.println("Navigated to login page");
	}

	@When("^user enters username and Password$")
	public void user_enters_username_and_Password() throws Throwable {
		System.out.println("User entered user name and password");
	}

	@Then("^success message is displayed$")
	public void success_message_is_displayed() throws Throwable {
		System.out.println("Successfully logined");
	}


}
