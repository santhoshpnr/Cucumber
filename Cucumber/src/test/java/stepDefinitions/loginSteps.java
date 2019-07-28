package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.loginPage;

public class loginSteps {

	public WebDriver driver;
	public loginPage lp;
	
	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/santhoshe/Downloads/chromedriver");	
		driver = new ChromeDriver(); 
	    lp= new loginPage(driver);
	}

	@When("User Enters URL {string}")
	public void user_Enters_URL(String url) {
	    driver.get(url);
		
		
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String pswd) {
	    lp.setUserName(email);
	    lp.setPassword(pswd);
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    
		lp.clickLogin();
	}

	@Then("pagetitle should be {string}")
	public void pagetitle_should_be(String title) {
	    
		Assert.assertEquals(title,driver.getTitle());
		driver.quit();
	}


}
