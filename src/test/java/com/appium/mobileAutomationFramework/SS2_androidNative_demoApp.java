package com.appium.mobileAutomationFramework;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import pageObjects.baseNavigationObjects;
import utilities.Base;
import utilities.SwipeActions;

public class SS2_androidNative_demoApp extends Base
{
	@Test
	public void androidNative_demoApp_positiveAction() throws MalformedURLException, IOException, InterruptedException
	{
		driver = connect();
		baseNavigationObjects baseObject = new baseNavigationObjects(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc='Forms']")));
		baseObject.clickOnSwipeTab();
		Thread.sleep(3000);
		SwipeActions swipe = new SwipeActions(driver);
		swipe.specialBottomOrientedSwipe_left();
	}
}
