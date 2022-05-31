package org.testing.Assertions;

import org.testing.Utilities.LogsCapture;

public class Assertion1 
{
	public static void assert_1(String expected, String actual, String classname)
	{
		if(expected.equals(actual))
		{
			LogsCapture.takeLogs(classname, "Login successful for "+classname);
			System.out.println("Verified successfully");
		}
		else
		{
			System.out.println("Verification failed");
		}
	}
	
	public static void assert_2(String expected, String actual, String classname)
	{
		if(expected.equals(actual))
		{
			LogsCapture.takeLogs(classname, "Output is successful for "+classname);
			System.out.println("Verified successfully");
		}
		else
		{
			System.out.println("Verification failed");
		}
	}
	
	public static void assert_3(String expected, String actual, String classname)
	{
		if(expected.equals(actual))
		{
			LogsCapture.takeLogs(classname, "Logout successful for "+classname);
			System.out.println("Verified successfully");
		}
		else
		{
			System.out.println("Verification failed");
		}
	}

}
