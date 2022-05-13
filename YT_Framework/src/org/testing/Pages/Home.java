package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home 
{
	ChromeDriver driver;
	Properties pr;
	
	public Home(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	public void Trending() throws InterruptedException
	{
		WebElement explore = driver.findElementByXPath(pr.getProperty("explore"));
		explore.click();
		Thread.sleep(3000);
		WebElement trending = driver.findElementByXPath(pr.getProperty("trending"));
		trending.click();
		Thread.sleep(3000);
	}
	public void History() throws InterruptedException
	{
		WebElement history = driver.findElementByXPath(pr.getProperty("history"));
		history.click();
		Thread.sleep(3000);
	}
	public void Subscriptions() throws InterruptedException
	{
		WebElement subscriptions = driver.findElementByXPath(pr.getProperty("subscriptions"));
		subscriptions.click();
		Thread.sleep(3000);
	}	
	public void WatchLater() throws InterruptedException
	{
		WebElement watchlater = driver.findElementByXPath(pr.getProperty("watchlater"));
		watchlater.click();
		Thread.sleep(3000);
	}
	public void Library() throws InterruptedException
	{
		WebElement library = driver.findElementByXPath(pr.getProperty("library"));
		library.click();
		Thread.sleep(3000);
	}
	public void BackToHome() throws InterruptedException
	{
		WebElement logo = driver.findElementByXPath(pr.getProperty("youtubelogo"));
		logo.click();
		Thread.sleep(5000);
	}

}
