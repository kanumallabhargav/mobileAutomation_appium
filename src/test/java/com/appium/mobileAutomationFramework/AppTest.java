package com.appium.mobileAutomationFramework;

import org.testng.annotations.Test;

import testData.tbData_helper;

import java.io.IOException;

public class AppTest
{
    @Test
    public void teter_random()
    {
    	try {
			System.out.println(tbData_helper.dataInput_textBox());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error!");
			e.printStackTrace();
		}
    }
}
