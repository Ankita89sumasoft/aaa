package mainjava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

public class DashBoardPage extends BaseTest
{
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement titleDashBoard;
	
	@FindBy(css=".oxd-userdropdown i")
	WebElement clickLogoutDrpDown;
	
	@FindBy(xpath="//*[text()='Logout']")
	WebElement txtLogout;
	
	// Initialization of locators/variables
	public DashBoardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String titleOfDashBoardPage() {
		return titleDashBoard.getText();
	}
	
	
	public void logOut() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().refresh();
		clickLogoutDrpDown.click();
		txtLogout.click();
	}
}

