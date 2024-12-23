package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configLoader
{
	public static String readPFData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\cucumber.properties");
		Properties p=new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	}
	
	

}
