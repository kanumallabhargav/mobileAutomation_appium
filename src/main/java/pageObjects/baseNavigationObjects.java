package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class baseNavigationObjects 
{
	WebDriver driver;
	private By formsTab = By.xpath("//android.view.ViewGroup[@content-desc='Forms']");
	private By webViewTab = By.xpath("//android.view.ViewGroup[@content-desc='WebView']");
	private By swipeTab = By.xpath("//android.view.ViewGroup[@content-desc='Swipe']");
	private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(formsTab);
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
	
	public ExpectedCondition<WebElement> explicitWait()
	{
		return waitLocator;
	}
}
