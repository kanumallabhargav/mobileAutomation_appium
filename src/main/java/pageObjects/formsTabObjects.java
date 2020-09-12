package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class formsTabObjects 
{
	WebDriver driver;
	private By textBox = By.xpath("//android.widget.EditText[@content-desc='text-input']");
	private By _switch = By.xpath("//android.widget.Switch[@content-desc='switch']");
	private By dropDown = By.xpath("//android.view.ViewGroup[@content-desc='select-Dropdown']");
	private By activeButton =By.xpath("//android.view.ViewGroup[@content-desc='button-Active']");
	

	public formsTabObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	public WebElement getTextBox()
	{
		return driver.findElement(textBox);
	}
	public void flipSwitch()
	{
		driver.findElement(_switch).click();
	}
	public void clickOnDropdown()
	{
		driver.findElement(dropDown).click();
	}
	public void clickOnActiveButton()
	{
		driver.findElement(activeButton).click();
	}
}
