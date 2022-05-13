package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Video 
{
	ChromeDriver driver;
	Properties pr;
	
	public Video(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void BackToHome() throws InterruptedException
	{
		WebElement logo = driver.findElementByXPath(pr.getProperty("youtubelogo"));
		logo.click();
		Thread.sleep(7000);
	}
	
	public void PlayAndLike() throws InterruptedException
	{
		WebElement video = driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		Thread.sleep(5000);
		WebElement like = driver.findElementByXPath(pr.getProperty("like"));
		like.click();
		Thread.sleep(2000);
	}
	
	public void PlayAndSubscribe() throws InterruptedException
	{
		WebElement video = driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		Thread.sleep(5000);
		WebElement subscribe = driver.findElementByXPath(pr.getProperty("subscribe"));
		subscribe.click();
		Thread.sleep(2000);
	}
	
	public void PlayAndComment(String comment) throws InterruptedException
	{
		WebElement video = driver.findElementByXPath(pr.getProperty("video"));
		video.click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(4000);
		WebElement field = driver.findElementByXPath(pr.getProperty("commentfield"));
		field.click();
		Thread.sleep(2000);
		WebElement text = driver.findElementByXPath(pr.getProperty("commenttext"));
		text.sendKeys(comment);
		Thread.sleep(2000);
		WebElement button = driver.findElementByXPath(pr.getProperty("commentbutton"));
		button.click();
		Thread.sleep(2000);
	}

}
