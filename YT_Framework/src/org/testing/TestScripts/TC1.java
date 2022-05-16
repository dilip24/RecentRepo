package org.testing.TestScripts;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testing.Base.Base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.Video;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.Screenshot;
import org.testng.annotations.Test;

public class TC1 extends Base
{
	
	@Test
	public void Trending() throws InterruptedException, IOException
	{
		LogsCapture.takeLogs("TC1", "Login successfull for TC1");
		
		/*Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
				
		Home homepage = new Home(driver, pr);
		homepage.Trending();
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Screenshots//TC1_Trending.jpg");
		
		Logout logout = new Logout(driver, pr);
		logout.signout();*/
		
		//Save screenshot with time
		/*Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		Integer hour = d.getHours();
		Integer mins = d.getMinutes();
		String s = "D://Workshop//Screenshots//"+hour.toString()+":"+mins.toString()+"_Home.jpg";
		Screenshot.takeScreenshot(driver, "D://Workshop//Screenshots//Home.jpg");
		System.out.println(s);*/
		
		
		
		
		
		
		
		/*homepage.Subscriptions();
		homepage.Library();
		homepage.History();
		homepage.WatchLater();
		homepage.BackToHome();
		Video video = new Video(driver, pr);
		video.PlayAndLike();
		video.BackToHome();
		video.PlayAndSubscribe();
		video.BackToHome();
		video.PlayAndComment("LOL");*/
				
		/*driver.findElementByXPath("//input[@aria-label='Email or phone']").sendKeys("writetogenius2022");
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@aria-label='Enter your password']").sendKeys("Newerabegins@2022");
		Thread.sleep(2000);
		driver.findElementByXPath("//span[text()='Next']").click();
		Thread.sleep(7000);
		driver.findElementByXPath("//yt-formatted-string[text()='Explore']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Trending']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//img[@alt='Avatar image']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//yt-formatted-string[text()='Sign out']").click();
		Thread.sleep(3000);*/
	}

}
