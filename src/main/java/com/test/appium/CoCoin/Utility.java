package com.test.appium.CoCoin;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

/**
 * Hello world!
 *
 */
public class Utility 
{
	
	AndroidDriver<WebElement> driver;
	
	public Utility(AndroidDriver<WebElement> driver){
		this.driver=driver;
	}
	public void enterPin()
	{
		System.out.println("Entering PIN");
		for (int i = 0; i < 4; i++) {
			WebElement pin1=driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']"));
			pin1.click();
		}

	}

	public void addingExpense(String value) 
	{

		System.out.println("Adding expense for "+value);
		WebElement icon=driver.findElement(By.xpath("//android.widget.TextView[@text='"+value+"']"));
		icon.click();

		for (int i = 0; i < 2; i++) {
			WebElement amount=driver.findElement(By.xpath("//android.widget.FrameLayout[@index='2']"));
			amount.click();
		}

		WebElement save=driver.findElement(By.xpath("//android.widget.FrameLayout[@index='11']"));
		save.click();
		waitSleep(2000);
	}

	public void swipeRightToLeft()
	{
		waitSleep(5000);

		System.out.println("Swiping---------");
		TouchAction act=new TouchAction(driver);
		Dimension size = driver.manage().window().getSize();
		int anchor = (int) (size.height * 0.7);
		int startPoint = (int) (size.width * 0.7);
		int endPoint = (int) (size.width * 0.01);
		// new TouchAction(driver).press(startPoint, anchor).waitAction(duration).moveTo(endPoint, anchor).release().perform();
		act.press(startPoint,anchor).waitAction(Duration.ofSeconds(3)).moveTo(endPoint,anchor).release().perform();


	}
	
	public void waitSleep(int sec)
	{
		try {
			System.out.println("-------Waiting for "+ sec+" milliseconds");
			Thread.sleep(sec);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
