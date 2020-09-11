package resources;

import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class swipeActionsHelper 
{
	WebDriver driver;

	public swipeActionsHelper(WebDriver driver) 
	{
		this.driver = driver;
	}

	ArrayList<Integer> coordinatesList = new ArrayList<Integer>();
	
	public ArrayList<Integer> screenCoordinates()
	{
		Dimension size = driver.manage().window().getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		
		
		coordinatesList.add(width/2);
		coordinatesList.add(height/2);
		coordinatesList.add((int) (height*0.2));
		coordinatesList.add((int) (height*0.8));
		coordinatesList.add((int) (width*0.2));
		coordinatesList.add((int) (width*0.8));
		coordinatesList.add((int) (height*0.7));
		
		return coordinatesList;
	}
}
