package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Assertions.Assertion1;
import org.testing.Base.Base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC2 extends Base
{
	@Test
	public void History() throws InterruptedException, IOException
	{		
		Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
		
//		//Hard Assertion
//		String expected_login = "https://www.youtube.com/";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_login);
//		
//		//Soft Assertion
//		Assertion1.assert_1(expected_login, driver.getCurrentUrl(), "TC2");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC2_Login.jpg");
		Thread.sleep(2000);
		//LogsCapture.takeLogs("TC1", "Login successful for TC1");		
		
		Home homepage = new Home(driver, pr);
		homepage.History();
		
//		//Hard Assertion
//		String expected_history = "https://www.youtube.com/feed/history";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_history);
//		
//		//Soft Assertion
//		Assertion1.assert_2(expected_history, driver.getCurrentUrl(), "TC2");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC2_History.jpg");
		Thread.sleep(2000);
		
		Logout logout = new Logout(driver, pr);
		logout.signout();
		
//		//Hard Assertion
//		String expected_logout = "https://www.youtube.com/";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_logout);
//		
//		//Soft Assertion
//		Assertion1.assert_3(expected_logout, driver.getCurrentUrl(), "TC2");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC2_Logout.jpg");
		Thread.sleep(2000);
		
		
		
		/*driver.findElementByXPath("//yt-formatted-string[text()='Sign in']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@aria-label='Email or phone']").sendKeys("writetogenius2022");
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@aria-label='Enter your password']").sendKeys("Newerabegins@2022");
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(7000);
		driver.findElementByXPath("//yt-formatted-string[text()='History']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//img[@alt='Avatar image']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(3000);*/
	}

}
