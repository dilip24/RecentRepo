package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout 
{
	ChromeDriver driver;
	Properties pr;
	
	public Logout(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signout() throws InterruptedException
	{
		WebElement profileicon = driver.findElementByXPath(pr.getProperty("profile"));
		profileicon.click();
		Thread.sleep(4000);
		WebElement signout = driver.findElementByXPath(pr.getProperty("signout"));
		signout.click();
		Thread.sleep(3000);
	}

}
