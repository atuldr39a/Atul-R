package com.test.appium.CoCoin;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppiumTestNativeApp 
{
	AndroidDriver<WebElement> driver;

	Utility util;
	

	


	@BeforeTest
	public void beforeTest() throws MalformedURLException 
	{

		File app=new File("Resources/CoCoin.apk");

		DesiredCapabilities desiredCapabilities=new DesiredCapabilities();

		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("platformVersion", "6.0");
		desiredCapabilities.setCapability("deviceName", "Lenovo");
		desiredCapabilities.setCapability("app", app.getAbsolutePath());

		driver= new  AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		System.out.println("Connecting to Appium Server");

	}
	@Test
	public void f()
	{

		util= new Utility(driver);
		
		util.swipeRightToLeft();// Swiping the first page
		util.swipeRightToLeft();
		util.swipeRightToLeft();
		util.swipeRightToLeft();

		util.waitSleep(5000);

		util.enterPin();
		util.enterPin();

		util.addingExpense("Home");
		util.addingExpense("Lunch");
		util.addingExpense("Breakfast");


		WebElement menu=driver.findElement(By.id("com.nightonke.cocoin:id/content_hamburger"));
		menu.click();

		util.enterPin();
		util.waitSleep(5000);
	}

	@AfterTest
	public void afterTest() 
	{
		driver.quit();
	}
	
	

}

