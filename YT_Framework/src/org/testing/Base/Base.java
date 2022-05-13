package org.testing.Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	
	@BeforeMethod
	public void Launch() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "../YT_Framework/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.youtube.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		
		File f = new File("../YT_Framework/Object.properties");
		FileReader fr = new FileReader(f);
		pr = new Properties();
		pr.load(fr);
	}
	
	@AfterMethod
	public void Close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
