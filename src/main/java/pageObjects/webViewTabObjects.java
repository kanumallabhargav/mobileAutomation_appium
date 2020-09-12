package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class webViewTabObjects 
{
	WebDriver driver;
	
	private By waitElement = By.id("search_input_react");
	private By scrollElement = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout"
									  + "/android.widget.FrameLayout/android.widget.FrameLayout/android.view."
									  + "ViewGroup[1]" + "/android.webkit.WebView/android.webkit.WebView/andro"
									  + "id.view.View[2]/android.view.View[26]/android.view.View[2]");
	private ExpectedCondition<WebElement> waitLocator = ExpectedConditions.visibilityOfElementLocated(waitElement);

	public webViewTabObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public ExpectedCondition<WebElement> explicitWait()
	{
		return waitLocator;
	}
	public boolean scrollVerifier()
	{
		return driver.findElement(scrollElement).isDisplayed();
	}
}
