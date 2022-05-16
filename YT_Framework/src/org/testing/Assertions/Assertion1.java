package org.testing.Assertions;

import org.testing.Utilities.LogsCapture;

public class Assertion1 
{
	public static void assert_1(String expected, String actual)
	{
		if(expected.equals(actual))
		{
			LogsCapture.takeLogs("TC1", "Login successfull for TC1");
			System.out.println("Values are matching");
		}
		else
		{
			LogsCapture.takeLogs("TC1", "Login unsuccessfull for TC1");
			System.out.println("Values are not matching");
		}
	}

}
