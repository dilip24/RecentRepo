package org.testing.Utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture 
{
	public static void takeLogs(String className, String message)
	{
		DOMConfigurator.configure("../YT_Framework/layoutfile.xml");
		Logger Log = Logger.getLogger(className);
		Log.info(message);
	}

}
