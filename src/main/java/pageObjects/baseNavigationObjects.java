package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class baseNavigationObjects 
{
	WebDriver driver;
	private By formsTab = By.xpath("//android.view.ViewGroup[@content-desc='Forms']");
	private By webViewTab = By.xpath("//android.view.ViewGroup[@content-desc='WebView']");
	private By swipeTab = By.xpath("//android.view.ViewGroup[@content-desc='Swipe']");
	
	public baseNavigationObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void clickOnFormsTab()
	{
		driver.findElement(formsTab).click();
	}
	public void clickOnWebViweTab()
	{
		driver.findElement(webViewTab).click();
	}
	public void clickOnSwipeTab()
	{
		driver.findElement(swipeTab).click();
	}
}
