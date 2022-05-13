package org.testing.TestScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC7 extends Base
{
	@Test
	public void WatchLater() throws InterruptedException, IOException
	{
		Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
		Thread.sleep(2000);
				
		Home homepage = new Home(driver, pr);
		homepage.WatchLater();
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Screenshots//TC7_WatchLater.jpg");
		
		Logout logout = new Logout(driver, pr);
		logout.signout();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		driver.findElementByXPath("//yt-formatted-string[text()='Watch Later']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//img[@alt='Avatar image']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(2000);*/
	}

}
