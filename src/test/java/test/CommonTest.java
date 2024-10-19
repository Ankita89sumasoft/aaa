package test;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CommonTest extends BaseTest
{


	@BeforeClass
	public void login() { 
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		loginPage.setUserName("Admin");
		loginPage.setPassword("admin123");
		loginPage.clickLoginBtn();
		String titleOfDash = dashBoardPage.titleOfDashBoardPage();
		Assert.assertEquals(titleOfDash, "Dashboard");
	}
}
