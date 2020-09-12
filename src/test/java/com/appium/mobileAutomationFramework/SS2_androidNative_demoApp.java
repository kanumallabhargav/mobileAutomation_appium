package com.appium.mobileAutomationFramework;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.baseNavigationObjects;
import pageObjects.formsTabObjects;
import pageObjects.webViewTabObjects;
import testData.tbData_helper;
import utilities.Base;
import utilities.SwipeActions;

public class SS2_androidNative_demoApp extends Base
{
	@Test
	public void androidNative_demoApp_positiveAction() throws MalformedURLException, IOException, InterruptedException
	{
		driver = connect();
		baseNavigationObjects baseObject = new baseNavigationObjects(driver);
		formsTabObjects formsObject = new formsTabObjects(driver);
		SwipeActions swipe = new SwipeActions(driver);
		webViewTabObjects webView = new webViewTabObjects(driver);

		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(baseObject.explicitWait());

		baseObject.clickOnFormsTab();
		formsObject.getTextBox().sendKeys(tbData_helper.dataInput_textBox());
		formsObject.flipSwitch();
		formsObject.clickOnActiveButton();

		baseObject.clickOnSwipeTab();
		for (int i=0;i<=5;i++)
		{
			swipe.specialBottomOrientedSwipe_left();
		}
		
		baseObject.clickOnWebViweTab();
		wait.until(webView.explicitWait());
		while(!webView.scrollVerifier())
		{
		swipe.swipeUp_generic();
		}
	}
}
