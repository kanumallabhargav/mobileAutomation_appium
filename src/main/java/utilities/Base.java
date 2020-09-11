package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;

public class Base 
{
	public WebDriver driver;
	Properties prop = new Properties();
	FileInputStream fis;
	public WebDriver connect() throws MalformedURLException, IOException
	{
		fis = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/config/appConfig.properties");
		prop.load(fis);
		String appPackage = prop.getProperty("appPackage");
		String appActivity = prop.getProperty("appActivity");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("noReset","true");
		cap.setCapability("fullReset","false");
		cap.setCapability("deviceName","android");
		cap.setCapability("platformVersion","9");
		cap.setCapability("platformName","Android");
		
		cap.setCapability("appPackage",appPackage);
		cap.setCapability("appActivity",appActivity);
		
		return driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	}
}
