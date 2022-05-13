package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	
	public Login(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void signin(String username, String password) throws InterruptedException
	{
		WebElement signin = driver.findElementByXPath(pr.getProperty("signin"));
		signin.click();
		Thread.sleep(2000);
		WebElement emailorphone = driver.findElementByXPath(pr.getProperty("username"));
		emailorphone.sendKeys(username);
		Thread.sleep(2000);
		WebElement next1 = driver.findElementByXPath(pr.getProperty("next"));
		next1.click();
		Thread.sleep(2000);
		WebElement pwd = driver.findElementByXPath(pr.getProperty("password"));
		pwd.sendKeys(password);
		Thread.sleep(2000);
		WebElement next2 = driver.findElementByXPath(pr.getProperty("next"));
		next2.click();
		Thread.sleep(7000);
		
	}

}
