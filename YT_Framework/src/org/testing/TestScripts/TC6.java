package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testing.Base.Base;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.Video;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC6 extends Base
{
	@Test
	public void PlayAndComment() throws InterruptedException, IOException
	{
		Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
		Thread.sleep(2000);
				
		Video video = new Video(driver, pr);
		video.PlayAndComment("LOL");
		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC6_Comment.jpg");
		Thread.sleep(2000);
		
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
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(4000);
		driver.findElementByXPath("//yt-formatted-string[@id='simplebox-placeholder']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//div[@id='contenteditable-root']").sendKeys("LOL");
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Comment']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//img[@alt='Avatar image']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(3000);*/
	}

}
