package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class formsTabObjects 
{
	WebDriver driver;
	private By textBox = By.xpath("//android.widget.EditText[@content-desc='text-input']");
	private By Switch = By.xpath("//android.widget.Switch[@content-desc='switch']");
	private By dropDown = By.xpath("//android.view.ViewGroup[@content-desc='select-Dropdown']");
	private By activeButton =By.xpath("//android.view.ViewGroup[@content-desc='button-Active']");
	

	public formsTabObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
}
