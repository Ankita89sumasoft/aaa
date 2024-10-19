package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class LoginPage extends BaseTest 
{

	// All the locators of page
		@FindBy(xpath = "//*[text()='Login']")
		WebElement txtLoginPage;
		
		@FindBy(name="username")
		WebElement userName;
		
		@FindBy(name="password")
		WebElement pass;
		
		@FindBy(tagName = "button")
		WebElement btnLogin;
		

		// Initialization of locators/variables
		public LoginPage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		
		

		public String titleOfLoginPage() {
			return txtLoginPage.getText();
		}
		
		
		public String urlOfPage() {
			return driver.getCurrentUrl();
		}
		
		
		public void setUserName(String usrName) {
			userName.sendKeys(usrName);
		}
		
		
		public void setPassword(String password) {
			pass.sendKeys(password);
		}
		
		
		public void clickLoginBtn() {
			btnLogin.click();
		}
		
		
		public String getBuildTitle() {
			return driver.getTitle();
		}

}
