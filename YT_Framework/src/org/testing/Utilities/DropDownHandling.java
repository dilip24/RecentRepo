package org.testing.Utilities;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling 
{
	static ChromeDriver driver;
	static Properties pr;
	
	public static void SelectByIndex(int input)
	{
		WebElement dropdown = driver.findElementByXPath(pr.getProperty("dropdownselectionbyindex"));
		Select index = new Select(dropdown);
		index.selectByIndex(input);
	}
	
	public static void SelectByVisibleText(String input)
	{
		WebElement dropdown = driver.findElementByXPath(pr.getProperty("dropdownselectionbytext"));
		Select text = new Select(dropdown);
		text.selectByVisibleText(input);
	}
	
	public static void SelectByValue(String input)
	{
		WebElement dropdown = driver.findElementByXPath(pr.getProperty("dropdownselectionbyvalue"));
		Select value = new Select(dropdown);
		value.selectByValue(input);
	}

}
