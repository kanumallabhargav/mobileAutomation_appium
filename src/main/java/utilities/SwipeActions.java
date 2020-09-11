package utilities;

import java.util.ArrayList;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import resources.swipeActionsHelper;

public class SwipeActions 
{
	WebDriver driver;
	
	/*swipeActionsHelper helper = new swipeActionsHelper(driver);
	ArrayList<Integer> points = helper.screenCoordinates();*/
	
	public SwipeActions(WebDriver driver) 
	{
		this.driver = driver;
	}
	//TouchAction action = new TouchAction( (PerformsTouchActions) driver);
	public void swipeUp_generic()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int x_center = points.get(0);
		int bottom_height = points.get(3);
		int top_height = points.get(2);
		action.press(PointOption.point(x_center,bottom_height)).moveTo(PointOption.point(x_center,top_height)).release().perform();
	}
	public void swipeDown_generic()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int x_center = points.get(0);
		int top_height = points.get(2);
		int bottom_height = points.get(3);
		action.press(PointOption.point(x_center,top_height)).moveTo(PointOption.point(x_center,bottom_height)).release().perform();
	}
	public void swipeRight_generic()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int left_width = points.get(4);
		int y_center = points.get(1);
		int right_width = points.get(5);
		action.press(PointOption.point(left_width, y_center)).moveTo(PointOption.point(right_width, y_center)).release().perform();
	}
	public void swipeLeft_generic()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int left_width = points.get(4);
		int y_center = points.get(1);
		int right_width = points.get(5);
		action.press(PointOption.point(right_width, y_center)).moveTo(PointOption.point(left_width, y_center)).release().perform();
	}
	public void specialBottomOrientedSwipe_left()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int right_width = points.get(5);
		int varHeight = points.get(6);
		int left_width = points.get(4);
		action.press(PointOption.point(right_width, varHeight)).moveTo(PointOption.point(left_width, varHeight)).release().perform();
	}
	public void specialBottomOrientedSwipe_right()
	{
		TouchAction action = new TouchAction( (PerformsTouchActions) driver);
		swipeActionsHelper helper = new swipeActionsHelper(driver);
		ArrayList<Integer> points = helper.screenCoordinates();
		int right_width = points.get(5);
		int varHeight = points.get(6);
		int left_width = points.get(4);
		action.press(PointOption.point(left_width, varHeight)).moveTo(PointOption.point(right_width, varHeight)).release().perform();
	}
}
