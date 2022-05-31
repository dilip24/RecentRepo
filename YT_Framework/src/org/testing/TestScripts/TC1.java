package org.testing.TestScripts;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testing.Assertions.Assertion1;
import org.testing.Base.Base;
import org.testing.Pages.Home;
import org.testing.Pages.Login;
import org.testing.Pages.Logout;
import org.testing.Pages.Video;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.Screenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


public class TC1 extends Base
{
	
	@Test
	public void Trending() throws InterruptedException, IOException
	{
		
		Login login = new Login(driver, pr);
		login.signin("writetogenius2022", "Newerabegins@2022");
		
//		//Hard Assertion
//		String expected_login = "https://www.youtube.com/";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_login);
//		
//		//Soft Assertion
//		Assertion1.assert_1(expected_login, driver.getCurrentUrl(), "TC1");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC1_Login.jpg");
		Thread.sleep(2000);
		//LogsCapture.takeLogs("TC1", "Login successful for TC1");		
		
		Home homepage = new Home(driver, pr);
		homepage.Trending();
		
//		//Hard Assertion
//		String expected_trending = "https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_trending);
//		
//		//Soft Assertion
//		Assertion1.assert_2(expected_trending, driver.getCurrentUrl(), "TC1");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC1_Trending.jpg");
		Thread.sleep(2000);
		
		Logout logout = new Logout(driver, pr);
		logout.signout();
		
//		//Hard Assertion
//		String expected_logout = "https://www.youtube.com/";
//		Assert.assertEquals(driver.getCurrentUrl(), expected_logout);
//		
//		//Soft Assertion
//		Assertion1.assert_3(expected_logout, driver.getCurrentUrl(), "TC1");
//		Thread.sleep(2000);
		
		Screenshot.takeScreenshot(driver, "D://Workshop//Selenium//Screenshots//TC1_Logout.jpg");
		Thread.sleep(2000);
		//LogsCapture.takeLogs("TC1", "Logout successful for TC1");
		
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
