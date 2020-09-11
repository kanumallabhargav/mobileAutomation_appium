package com.appium.mobileAutomationFramework;

import org.testng.annotations.Test;
import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import utilities.Base;

public class DemosTester extends Base
{
	@Test
	public void demo() throws MalformedURLException, IOException
	{
		driver = connect();
		driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
		driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
		driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		String result = driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"No formula\"]")).getText();

		System.out.println("The result is: "+result);
	}
}
