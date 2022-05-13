package org.testing.TestScripts;

import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.Video;
import org.testng.annotations.Test;

public class TC5 extends Base
{
	@Test
	public void PlayAndSubscribe() throws InterruptedException
	{
		Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
		Thread.sleep(2000);
				
		Video video = new Video(driver, pr);
		video.PlayAndSubscribe();
		
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
		driver.findElementByXPath("(//yt-formatted-string[@id='video-title'])").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//yt-formatted-string[text()='Subscribe']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//img[@alt='Avatar image']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(3000);*/
	}

}
