package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class loginPage{
	public WebDriver ldriver;
	
	
	//Page Factory - OR:
	@FindBy(id="Email")
	WebElement emailid;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginBtn;
	
	//Initializing the Page Objects:
		public loginPage(WebDriver rdriver){
			ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}
public void setUserName(String email) {
	emailid.clear();
	emailid.sendKeys(email);
}
public void setPassword(String pswd){
	password.clear();
	password.sendKeys(pswd);
}
public void clickLogin() {
	loginBtn.click();
}
}